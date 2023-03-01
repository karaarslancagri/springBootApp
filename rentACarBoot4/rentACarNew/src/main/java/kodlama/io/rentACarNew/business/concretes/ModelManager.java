package kodlama.io.rentACarNew.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import kodlama.io.rentACarNew.business.abstracts.ModelService;
import kodlama.io.rentACarNew.business.requests.CreateModelRequest;
import kodlama.io.rentACarNew.business.responses.GetAllModelsResponse;
import kodlama.io.rentACarNew.core.utilities.mappers.ModelMapperService;
import kodlama.io.rentACarNew.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACarNew.entities.concretes.Model;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {

	private ModelRepository modelRepository;
	private ModelMapperService modelMapperService;

	@Override
	public List<GetAllModelsResponse> getAll() {

		List<Model> models = modelRepository.findAll();

		// stream() --> for eachin yaptığını yapar.

		List<GetAllModelsResponse> modelsResponses = models.stream()
				.map(model -> this.modelMapperService.forResponse().map(model, GetAllModelsResponse.class))
				.collect(Collectors.toList());

		return modelsResponses;

		
	}

	@Override
	public void add(CreateModelRequest createModelRequest) {
		Model model = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
		
		this.modelRepository.save(model);
		
	}

}
