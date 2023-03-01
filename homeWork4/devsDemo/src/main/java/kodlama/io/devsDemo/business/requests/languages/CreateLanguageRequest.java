package kodlama.io.devsDemo.business.requests.languages;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateLanguageRequest {
	
	@NotBlank
	@NotNull
	@Size(min = 2, max = 20)
	private String name;

}
