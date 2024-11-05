package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Tipo;

@Repository
public interface TipoRepository extends JpaRepository<Tipo,Long>{

}
