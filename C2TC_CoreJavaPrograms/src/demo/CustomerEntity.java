package demo;

public class CustomerEntity {
	private int customer_id;
	private String customer_name;
	private  String city;
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "CustomerEntity [customer_id=" + customer_id + ", customer_name=" + customer_name + ", city=" + city
				+ "]";
	}
	

}