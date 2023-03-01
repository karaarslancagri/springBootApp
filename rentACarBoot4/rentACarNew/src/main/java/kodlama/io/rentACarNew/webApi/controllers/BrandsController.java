package kodlama.io.rentACarNew.webApi.controllers;

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
import kodlama.io.rentACarNew.business.abstracts.BrandService;
import kodlama.io.rentACarNew.business.requests.CreateBrandRequest;
import kodlama.io.rentACarNew.business.requests.UpdateBrandRequest;
import kodlama.io.rentACarNew.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACarNew.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController {
	private BrandService brandService;

	@GetMapping("/getall")
	public List<GetAllBrandsResponse> getAll() {

		return brandService.getAll();
	}

	@GetMapping("/getbyid {id}")
	public GetByIdBrandResponse getById(@PathVariable int id) {
		return brandService.getById(id);
	}

	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void add(@RequestBody @Valid() CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	
	@DeleteMapping("/delete {id}")
	public void delete(@PathVariable int id) {
		this.brandService.delete(id);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
