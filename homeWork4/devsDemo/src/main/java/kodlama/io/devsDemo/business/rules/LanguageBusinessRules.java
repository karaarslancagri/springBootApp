package kodlama.io.devsDemo.business.rules;

import org.springframework.stereotype.Service;

import kodlama.io.devsDemo.core.utilities.exceptions.BusinessException;
import kodlama.io.devsDemo.dataAccess.abstracts.LanguageRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class LanguageBusinessRules {
	
	private LanguageRepository languageRepository;
	
	public void checkIfBrandExists(String name) {
		if(this.languageRepository.existsByName(name)) {
			throw new BusinessException("Language name already exists!");
		}
	}

}
