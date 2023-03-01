package kodlama.io.rentACarNew.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACarNew.entities.concretes.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>{

}
