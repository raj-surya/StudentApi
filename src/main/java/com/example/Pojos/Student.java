package com.example.Pojos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private Long id;
    
    @NotBlank
    private String name;
    
    @Min(18)
    private Integer age;
  
    public Student() {
    	
    }
    
	public Student(Long id, @NotBlank String name, @Min(18) Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    
   
}

