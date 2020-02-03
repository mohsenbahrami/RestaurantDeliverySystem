package model;

public class Restaurant {
	private User manager;
	private User chef;
	private String restaurantName;
	private String restaurantAddress;
	private String restaurantTelephone;
	private String restaurantDeliveryArea;
	private String restaurantOpenningHours;
	private int sataus;
	
	
	
	public Restaurant(User manager,User chef,String restaurantName, String restaurantAddress, String restaurantTelephone,
			String restaurantDeliveryArea, String restaurantOpenningHours,int sataus) {
		
		this.manager = manager;
		this.chef = chef;
		this.restaurantName = restaurantName;
		this.restaurantAddress = restaurantAddress;
		this.restaurantTelephone = restaurantTelephone;
		this.restaurantDeliveryArea = restaurantDeliveryArea;
		this.restaurantOpenningHours = restaurantOpenningHours;
		this.sataus = sataus;
	}

}
