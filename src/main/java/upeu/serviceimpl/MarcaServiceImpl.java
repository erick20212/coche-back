package upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.MarcaDao;
import upeu.entity.Marca;
import upeu.service.MarcaService;

@Service
class MarcaServiceImpl implements MarcaService{

	@Autowired
	private MarcaDao dao;
	@Override
	public Marca create(Marca a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Marca update(Marca a) {
		// TODO Auto-generated method stub
		return dao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Marca> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Marca> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
