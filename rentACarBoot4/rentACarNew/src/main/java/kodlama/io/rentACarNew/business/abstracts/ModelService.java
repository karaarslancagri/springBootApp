package kodlama.io.rentACarNew.business.abstracts;

import java.util.List;

import kodlama.io.rentACarNew.business.requests.CreateModelRequest;
import kodlama.io.rentACarNew.business.responses.GetAllModelsResponse;

public interface ModelService {
	List<GetAllModelsResponse> getAll();
	
	void add(CreateModelRequest createModelRequest);
}
