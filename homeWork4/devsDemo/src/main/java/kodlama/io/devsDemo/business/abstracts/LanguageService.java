package kodlama.io.devsDemo.business.abstracts;

import java.util.List;

import kodlama.io.devsDemo.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devsDemo.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devsDemo.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.devsDemo.business.responses.languages.GetByIdLanguageResponse;

public interface LanguageService {

	List<GetAllLanguagesResponse> getAll();

	GetByIdLanguageResponse getById(int id);

	void add(CreateLanguageRequest createLanguageRequest);

	void update(UpdateLanguageRequest updateLanguageRequest);

	void delete(int id);
}
