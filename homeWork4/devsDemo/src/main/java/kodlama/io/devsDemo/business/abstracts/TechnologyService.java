package kodlama.io.devsDemo.business.abstracts;

import java.util.List;

import kodlama.io.devsDemo.business.requests.technologies.CreateTechnologyRequest;
import kodlama.io.devsDemo.business.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.devsDemo.business.responses.technologies.GetAllTechnologiesResponse;

public interface TechnologyService {
	
	List<GetAllTechnologiesResponse> getAll();	
	
	void add(CreateTechnologyRequest createTechnologyRequest);
	
	void update(UpdateTechnologyRequest updateTechnologyRequest);
	
	void delete(int id);

}
