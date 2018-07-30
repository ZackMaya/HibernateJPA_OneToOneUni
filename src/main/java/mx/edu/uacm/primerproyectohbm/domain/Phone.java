package mx.edu.uacm.primerproyectohbm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Phone {

	@Id
	@GeneratedValue
	private Long id;
	
	
	private String number;
	
	//Relacion uno a uno
	//Se puede poner por default las columnas
	@OneToOne
	@JoinColumn(name ="details_id")
	private PhoneDetails details;

	public Phone() {
		
	}
	
	public Phone(String number) {
		this.number = number;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public PhoneDetails getDetails() {
		return details;
	}

	public void setDetails(PhoneDetails details) {
		this.details = details;
	}
	
	
	
}
