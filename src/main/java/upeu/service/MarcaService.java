package upeu.service;

import java.util.List;
import java.util.Optional;

import upeu.entity.Marca;

public interface MarcaService {
	
	Marca create(Marca a);
	Marca update(Marca a);
	void delete(Long id);
	Optional<Marca>read(Long id);
	List<Marca>readAll();

}
