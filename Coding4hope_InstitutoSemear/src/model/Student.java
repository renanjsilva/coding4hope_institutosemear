package model;

public class Student extends User {
	private String degree; 
	private Integer degreeYear;
	
	public Student() {
		super();
	}
	
	public Student (Administrator idAdm, String email, String password, String name, String cpf, Integer age, String degree, Integer degreeYear) {
		super (idAdm, email, password, name, cpf, age);
		this.degree = degree;
		this.degreeYear = degreeYear;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Integer getDegreeYear() {
		return degreeYear;
	}

	public void setDegreeYear(Integer degreeYear) {
		this.degreeYear = degreeYear;
	}
	
	

}
