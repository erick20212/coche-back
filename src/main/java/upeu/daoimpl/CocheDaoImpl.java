package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.CocheDao;
import upeu.entity.Coche;
import upeu.entity.Marca;
import upeu.entity.Tipo;
import upeu.repository.CocheRepository;
import upeu.repository.MarcaRepository;
import upeu.repository.TipoRepository;

@Component
public class CocheDaoImpl implements CocheDao {

    @Autowired
    private CocheRepository repository;

    @Autowired
    private MarcaRepository marcaRepository;

    @Autowired
    private TipoRepository tipoRepository;

    @Override
    public Coche create(Coche coche) {
        // Cargar la entidad Marca usando el ID proporcionado en coche
        Marca marca = marcaRepository.findById(coche.getMarca().getId())
                .orElseThrow(() -> new RuntimeException("Marca no encontrada"));

        // Cargar la entidad Tipo usando el ID proporcionado en coche
        Tipo tipo = tipoRepository.findById(coche.getTipo().getId())
                .orElseThrow(() -> new RuntimeException("Tipo no encontrado"));

        // Asignar las relaciones de Marca y Tipo a la entidad Coche
        coche.setMarca(marca);
        coche.setTipo(tipo);

        // Guardar la entidad en la base de datos
        return repository.save(coche);
    }

    @Override
    public Coche update(Coche coche) {
        return repository.save(coche);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Coche> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Coche> readAll() {
        return repository.findAll();
    }
}
