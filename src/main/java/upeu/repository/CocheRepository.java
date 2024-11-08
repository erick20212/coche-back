package upeu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import upeu.entity.Coche;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long>{

}
