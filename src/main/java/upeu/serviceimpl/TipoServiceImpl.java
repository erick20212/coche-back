package upeu.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.dao.TipoDao;
import upeu.entity.Tipo;
import upeu.service.TipoService;

@Service
public class TipoServiceImpl implements TipoService{

	@Autowired
	private TipoDao dao;
	@Override
	public Tipo create(Tipo a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public Tipo update(Tipo a) {
		// TODO Auto-generated method stub
		return dao.create(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		
	}

	@Override
	public Optional<Tipo> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Tipo> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
