package kodlama.io.devsDemo.business.responses.technologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllTechnologiesResponse {
	
	private int id;
	private String name;
	private String languageName;

}
