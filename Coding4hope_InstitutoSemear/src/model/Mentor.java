package model;

public class Mentor extends User {
	private String speciality;
	
	public Mentor() {
		super();
	}
	
	public Mentor(Administrator idAdm, String email, String password, String name, String cpf, Integer age, String speciality) {
		super(idAdm, email, password, name, cpf, age);
		this.speciality = speciality; 
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}			

}
