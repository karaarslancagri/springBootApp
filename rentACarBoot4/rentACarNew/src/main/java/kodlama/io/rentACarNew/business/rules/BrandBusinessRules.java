package kodlama.io.rentACarNew.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.rentACarNew.core.utilities.exceptions.BusinessException;
import kodlama.io.rentACarNew.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
	
	private BrandRepository brandRepository;
	
	public void checkIfBrandNameExists(String name) {
		if(this.brandRepository.existsByName(name)) {
			throw new BusinessException("Brand name already exists !");
		}
	}

}
