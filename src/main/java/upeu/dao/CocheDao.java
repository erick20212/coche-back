package upeu.dao;

import java.util.List;
import java.util.Optional;

import upeu.entity.Coche;

public interface CocheDao {

	Coche create(Coche a);
	Coche update(Coche a);
	void delete(Long id);
	Optional<Coche>read(Long id);
	List<Coche>readAll();
}
