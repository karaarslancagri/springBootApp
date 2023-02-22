package kodlama.io.rentACarNew.business.abstracts;

import java.util.List;

import kodlama.io.rentACarNew.business.requests.CreateBrandRequest;
import kodlama.io.rentACarNew.business.requests.UpdateBrandRequest;
import kodlama.io.rentACarNew.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACarNew.business.responses.GetByIdBrandResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	GetByIdBrandResponse getById(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	void update(UpdateBrandRequest updateBrandRequest);
	void delete(int id);
}
