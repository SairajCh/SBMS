package in.ashokit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Integer pid;
	
	@NotBlank(message="Name is mandatory")
	@Size(min= 3,max=15,message="Name should have 3-15 characters")
	private String name;
	
	@Positive(message="price should be positive")
	@NotNull(message="Price is mandatory")
	private Double price;
	
	@NotNull(message="Quantity is mandatory")
	private Integer qty;

}
