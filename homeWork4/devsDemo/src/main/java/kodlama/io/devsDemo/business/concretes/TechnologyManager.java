package kodlama.io.devsDemo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.devsDemo.business.abstracts.TechnologyService;
import kodlama.io.devsDemo.business.requests.technologies.CreateTechnologyRequest;
import kodlama.io.devsDemo.business.requests.technologies.UpdateTechnologyRequest;
import kodlama.io.devsDemo.business.responses.technologies.GetAllTechnologiesResponse;
import kodlama.io.devsDemo.core.utilities.mappers.ModelMapperService;
import kodlama.io.devsDemo.dataAccess.abstracts.TechnologyRepository;
import kodlama.io.devsDemo.entities.concretes.Technology;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class TechnologyManager implements TechnologyService{
	
	
	private TechnologyRepository technologyRepository;
	
	private ModelMapperService modelMapperService;	

	@Override
	public List<GetAllTechnologiesResponse> getAll() {
		
		List<Technology> technologies = technologyRepository.findAll();
		
		List<GetAllTechnologiesResponse> technologiesResponses = technologies.stream()
				.map(technology -> this.modelMapperService.forResponse()
						.map(technology, GetAllTechnologiesResponse.class)).collect(Collectors.toList());
				
		
		return technologiesResponses;
	}

	@Override
	public void add(CreateTechnologyRequest createTechnologyRequest) {
		
		Technology technology = this.modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
		
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void update(UpdateTechnologyRequest updateTechnologyRequest) {
		
		Technology technology = this.modelMapperService.forRequest().map(updateTechnologyRequest, Technology.class);
		
		this.technologyRepository.save(technology);
		
	}

	@Override
	public void delete(int id) {
		
		this.technologyRepository.deleteById(id);
	}

}
