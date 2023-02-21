package kodlama.io.rentACarNew.business.abstracts;

import java.util.List;

import kodlama.io.rentACarNew.business.requests.CreateBrandRequest;
import kodlama.io.rentACarNew.business.responses.GetAllBrandsResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);
}
