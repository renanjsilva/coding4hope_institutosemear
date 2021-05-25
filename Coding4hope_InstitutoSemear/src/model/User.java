package model;

public class User {
	private Administrator idAdm;
	private String email;
	private String password;
	private String name;
	private String cpf;
	private Integer age;
	
	
	public User () {
	}
	
	public User(Administrator idAdm, String email, String password, String name, String cpf, Integer age) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.cpf = cpf;
		this.age = age;
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		if(isCpf(cpf)) {
			this.cpf = cpf;
		}
	}	
	
	public boolean isCpf(String cpf) {

		if(cpf.equals("00000000000")||cpf.equals("11111111111")||cpf.equals("22222222222")||cpf.equals("33333333333")
		||cpf.equals("44444444444")||cpf.equals("55555555555")||cpf.equals("66666666666")||cpf.equals("77777777777")
		||cpf.equals("88888888888")||cpf.equals("99999999999")|| (cpf.length()!=11)) {
			return false;
		}

		int valorCalculado=0, i, peso=10;
		
		for(i=0;i<9;i++) { 

			valorCalculado+= ((int)cpf.charAt(i)-48) * peso; 
			peso--;
		}

		valorCalculado = valorCalculado * 10 %11;
		if(valorCalculado==10) {
			valorCalculado=0;
		}

		if(valorCalculado!=(cpf.charAt(9)-48)) {
			return false;
		}
		
		valorCalculado = 0;
		peso = 11;
		
		for(i=0;i<10;i++) { 

			valorCalculado+= ((int)cpf.charAt(i)-48) * peso; 

			peso--;
		}
		valorCalculado = valorCalculado * 10 %11;
		if(valorCalculado==10) {
			valorCalculado=0;
		}
		
		if(valorCalculado!=(cpf.charAt(10)-48)) {
			return false;
		}
		
		return true;
	}

	public Administrator getIdAdm() {
		return idAdm;
	}

	public void setIdAdm(Administrator idAdm) {
		this.idAdm = idAdm;
	}
}