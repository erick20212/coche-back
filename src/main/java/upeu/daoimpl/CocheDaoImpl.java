package upeu.daoimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import upeu.dao.CocheDao;
import upeu.entity.Coche;
import upeu.repository.CocheRepository;

@Component
public class CocheDaoImpl implements CocheDao{
	
	@Autowired
	private CocheRepository repository;
	@Override
	public Coche create(Coche a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public Coche update(Coche a) {
		// TODO Auto-generated method stub
		return repository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public Optional<Coche> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Coche> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
