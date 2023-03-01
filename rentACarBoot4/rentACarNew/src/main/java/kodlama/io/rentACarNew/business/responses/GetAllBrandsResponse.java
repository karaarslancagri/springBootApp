package kodlama.io.rentACarNew.business.responses;

import java.util.List;

import kodlama.io.rentACarNew.entities.concretes.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
	private int id;
	private String name;
	
	//private List<Model> modelName;
}
