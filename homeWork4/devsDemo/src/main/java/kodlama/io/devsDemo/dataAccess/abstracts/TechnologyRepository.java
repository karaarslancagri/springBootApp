package kodlama.io.devsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.devsDemo.entities.concretes.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology,Integer>{
	
}
