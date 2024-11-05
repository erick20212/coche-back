package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.TipoDao;
import upeu.entity.Tipo;
import upeu.repository.TipoRepository;

@Component
public class TipoDaoImpl implements TipoDao{

	@Autowired
	private TipoRepository repository;
	@Override
	public Tipo create(Tipo a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Tipo update(Tipo a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
