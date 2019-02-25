

public class Customer {
	String name;
	String phone;
	// address is a reference variable which points to adress object

	Address[] addresses; // 1 to many
	// order is a reference variable which points to adress object
	Order[] orders;  // 1 to many
	
	//method 1 :write data in object
	void setDetailsForCustomer(String name, String phone,Address[] addresses,Order[] orders) {
		this.name = name;
		this.phone = phone;
		this.addresses = addresses;
		this.orders =orders;
        }
	
	
     void showDetailsForCustomer() {
    	 System.out.println("******customer"+name+"********");
    	 System.out.println("phone "+phone);
    	 
    	 System.out.println("##########Addresss#############");
    	 for(Address aRef : addresses) {
    		 aRef.showAddressDetails();
    	 }
    	 System.out.println("################################");
    	  
    	 System.out.println("$$$$$$$$$$$$Orders$$$$$$$$$$$$$$$");
    	 for(Order oRef : orders) {
    		 aRef.showOrderDetails();
    	 }
    	 
    	 System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
     //method : customer object
     //computation | business method
  int kitnekharachDiye() {
	int total= 0;
	return total;
}
}
