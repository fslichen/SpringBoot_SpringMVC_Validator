package evolution.controller.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class AnyDto {
	@NotNull
	private String name;
}
