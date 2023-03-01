package kodlama.io.rentACarNew.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACarNew.entities.concretes.Brand;


public interface BrandRepository extends JpaRepository<Brand, Integer>{										
	boolean existsByName(String name);											
}
