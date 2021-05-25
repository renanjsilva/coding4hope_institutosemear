package model;

public class Adress {
	private User user;
	private Integer id;
	private String street;
	private Integer number;
	private String cep;
	private String city;
	
	
	public Adress(User user, Integer id, String street, Integer number, String cep, String city) {
		this.user = user;
		this.id = id;
		this.street = street;
		this.number = number;
		this.cep = cep;
		this.city = city;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
