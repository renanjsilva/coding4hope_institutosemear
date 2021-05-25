package model;

public class Administrator {
	private Integer idAdm;	
	public Administrator() {
	}
	
	public Administrator (String email, String password, String name, String cpf,Integer age, Integer idAdm, String levelAdm) {
		this.idAdm = idAdm; 
	}

	public Integer getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(Integer idAdm) {
		this.idAdm = idAdm;
	}
}
