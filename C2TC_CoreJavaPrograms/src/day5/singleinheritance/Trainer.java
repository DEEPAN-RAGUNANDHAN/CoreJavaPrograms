package day5.singleinheritance;

public class Trainer extends Person{
	private String designation;
	private String location;
	public Trainer() {
		super();
		this.designation="prog trainer";
		this.location="chennai";
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
