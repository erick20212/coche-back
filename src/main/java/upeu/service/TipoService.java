package upeu.service;

import java.util.List;
import java.util.Optional;

import upeu.entity.Tipo;

public interface TipoService {
	Tipo create(Tipo a);
	Tipo update(Tipo a);
	void delete(Long id);
	Optional<Tipo>read(Long id);
	List<Tipo>readAll();


}
