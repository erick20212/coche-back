package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca,Long>{

}
