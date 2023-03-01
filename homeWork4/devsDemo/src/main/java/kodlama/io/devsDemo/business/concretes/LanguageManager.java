package kodlama.io.devsDemo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.devsDemo.business.abstracts.LanguageService;
import kodlama.io.devsDemo.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devsDemo.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devsDemo.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.devsDemo.business.responses.languages.GetByIdLanguageResponse;
import kodlama.io.devsDemo.business.rules.LanguageBusinessRules;
import kodlama.io.devsDemo.core.utilities.mappers.ModelMapperService;
import kodlama.io.devsDemo.dataAccess.abstracts.LanguageRepository;
import kodlama.io.devsDemo.entities.concretes.Language;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LanguageManager implements LanguageService {
	
	private LanguageRepository languageRepository;
	private ModelMapperService modelMapperService;
	private LanguageBusinessRules languageBusinessRules;

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		
		List<Language> languages = languageRepository.findAll();
		
		
		List<GetAllLanguagesResponse> languagesResponses = languages.stream()
				.map(language -> this.modelMapperService.forResponse()
						.map(language, GetAllLanguagesResponse.class)).collect(Collectors.toList());
		
		return languagesResponses;
	}


	@Override
	public GetByIdLanguageResponse getById(int id) {
		
		Language language = this.languageRepository.findById(id).orElseThrow();
		
		GetByIdLanguageResponse response = this.modelMapperService.forResponse().map(language, GetByIdLanguageResponse.class);
		
		return response;
	}
	


	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		
		this.languageBusinessRules.checkIfBrandExists(createLanguageRequest.getName());
		
		Language language = this.modelMapperService.forRequest().map(createLanguageRequest, Language.class);
		
		this.languageRepository.save(language);
		
	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		Language language = this.modelMapperService.forRequest().map(updateLanguageRequest, Language.class);
		
		this.languageRepository.save(language);
		
	}
	
	@Override
	public void delete(int id) {
		
		this.languageRepository.deleteById(id);
		
	}


	
	

}
