

public class ZomatoApp {

	public static void main(String[] args) {
	 // array of address
		Address[] arr = new Address[3];
		for(int i= 0; i<arr.length;i++) {
			arr[i]= new Address();
			}
		
		
		Order[] orr = new Order[5];
		for(int i= 0; i<orr.length;i++) {
			orr[i] = new Order();
		}
		
		
		arr[0].setAddressDetails(34.055,74.304,"redwood shores","ludhiana",141001,"home");
		
		arr[1].setAddressDetails(35.055,72.304,"country homes","ludhiana",141003,"work");
		
		arr[2].setAddressDetails(36.055,71.304,"pristine homes","ludhiana",141002,"uncle");
		
		
		
		orr[0].setOrderDetails(101,"30-01-2019","10:00",200);
		orr[1].setOrderDetails(102,"30-01-2019","10:20",300);
		orr[2].setOrderDetails(103,"30-01-2019","10:40",400);
		orr[3].setOrderDetails(104,"30-01-2019","11:00",500);
		orr[4].setOrderDetails(105,"30-01-2019","11:30",600);
		  
		Customer c1  new Customer();
		
		// 1 to many
		c1.setDetailsForCustomer("kapil","8727998895",arr, orr);
		
		
		c1.showDetailsForCustomer();
       
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println(c1.name+" spent \u20b9"+c1.kitnekharachDiye());
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

}
