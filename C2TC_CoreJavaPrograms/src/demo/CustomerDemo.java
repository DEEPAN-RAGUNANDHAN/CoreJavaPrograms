package demo;

public class CustomerDemo {

	public static void main(String[] args) {
		CustomerEntity ct = new CustomerEntity();
		ct.setCustomer_id(101);
		ct.setCustomer_name("JOHNNNNYYYY");
		ct.setCity("Chennai");
		
		System.out.println(ct);
		
		CustomerEntity ct1 = new CustomerEntity();
		ct1.setCustomer_id(102);
		ct1.setCustomer_name("JOESSTARRR");
		ct1.setCity("Kanchipuram");
		System.out.println(ct1);

	}

}
