package kodlama.io.devsDemo.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devsDemo.business.abstracts.TechnologyService;
import kodlama.io.devsDemo.business.requests.technologies.CreateTechnologyRequest;
import kodlama.io.devsDemo.business.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.devsDemo.business.responses.technologies.GetAllTechnologiesResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/technologies")
@AllArgsConstructor
public class TechnologiesController {
	
	private TechnologyService technologyService;
	
	@GetMapping("getall")
	public List<GetAllTechnologiesResponse> getAll(){
		
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		this.technologyService.add(createTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateTechnologyRequest updateTechnologyRequest) {
		this.technologyService.update(updateTechnologyRequest);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		this.technologyService.delete(id);
	}
	
	
	
	
	
	
	
	
}
