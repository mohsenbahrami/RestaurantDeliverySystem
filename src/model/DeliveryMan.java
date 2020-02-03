package model;

public class DeliveryMan extends User {
	
	private String fName;
	private String lName;
	private String telephone;
	private String postalCode;
	
	
	public DeliveryMan(String username, String password, int status, String fName, String lName, String telephone,
			String postalCode) {
		super(username, password, status);
		this.fName = fName;
		this.lName = lName;
		this.telephone = telephone;
		this.postalCode = postalCode;
	}
	
	
	

}
