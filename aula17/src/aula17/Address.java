package aula17;
public class Address {
	private String street;
	private Integer number;
	private String burgh;
	private String city;
	private String state;
	
	public Address() {
		
	}
	public Address(String street, Integer number, String burgh, String city, String state) {
		super();
		this.street = street;
		this.number = number;
		this.burgh = burgh;
		this.city = city;
		this.state = state;
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
	public String getBurgh() {
		return burgh;
	}
	public void setBurgh(String burgh) {
		this.burgh = burgh;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return ", street=" + street + ", number=" + number + ", burgh=" + burgh + ", city=" + city + ", state="
				+ state;
	}
}