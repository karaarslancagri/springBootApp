package kodlama.io.devsDemo.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.devsDemo.entities.concretes.Language;


@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer>{
	boolean existsByName(String name);
	
}
