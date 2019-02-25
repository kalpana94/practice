// textual representaion of an object
//model of bean or POJO(plan old java object)

public class Address {

	
		double latitude;
		double longitude;
		String adrsLine ;
		String city;
		int zipCode;
		String label;
		
		// methods1 write data in object 
		//this is a reference variable which points to current object
		//this.latitude is property of object
		//latitude is property of method1
		void setAddressDetails(double latitude,double longitude,String adrsLine ,String city,int zipCode,String label) {
			this.latitude = latitude;
			this.longitude = longitude;
			this.adrsLine = adrsLine ;
			this.city = city;
			this.zipCode = zipCode;
			this.label = label;
			
		} 
		//method2 : to read data from object
		void showAddressDetails() {
			System.out.println("**********Address**********************");
			
			System.out.println("Location: "+latitude+"  : "+longitude);
			System.out.println(" Address Line: "+adrsLine);
			System.out.println("Address Line: "+adrsLine);
			System.out.println("City:"+city+" | "+zipCode);
			System.out.println("Address Type: "+label);
			System.out.println("*****************************************");
			
		
	}

}
