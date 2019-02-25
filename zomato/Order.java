

public class Order {

	
		int orderId;
		String date;
		String time;
	    int price;
	    // method1  write data in object
	    void setOrderDetails(int orderId,String date,String time,int price) {
	    	this.orderId  = orderId;
	    	this.date = date;
	    	this.time = time;
	    	this.price = price;
	    }
	    //method 2 read data from object
	    void showOrderDEtails() {
	    	System.out.println("@@@@@@Order: "+orderId+"@@@@@@@@");
	    	System.out.println(" DateTime: "+date+" |"+time);
	    	System.out.println(" Price: \u20b9"+price);
	    	System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		    
	    }

	}


