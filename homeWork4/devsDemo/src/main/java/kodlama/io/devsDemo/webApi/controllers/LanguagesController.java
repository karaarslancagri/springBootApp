package kodlama.io.devsDemo.webApi.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import kodlama.io.devsDemo.business.abstracts.LanguageService;
import kodlama.io.devsDemo.business.requests.languages.CreateLanguageRequest;
import kodlama.io.devsDemo.business.requests.languages.UpdateLanguageRequest;
import kodlama.io.devsDemo.business.responses.languages.GetAllLanguagesResponse;
import kodlama.io.devsDemo.business.responses.languages.GetByIdLanguageResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/languages")
@AllArgsConstructor
public class LanguagesController {

	private LanguageService languageService;
	
	
	
	@GetMapping("/getall")
	public List<GetAllLanguagesResponse> getAll(){
		
		return languageService.getAll();
	}
	
	@GetMapping("/{id}")
	public GetByIdLanguageResponse getById(int id) {
		
		return languageService.getById(id);
	}
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody @Valid() CreateLanguageRequest createLanguageRequest) {
		this.languageService.add(createLanguageRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable  int id) {
		this.languageService.delete(id);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateLanguageRequest updateLanguageRequest) {
		this.languageService.update(updateLanguageRequest);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
