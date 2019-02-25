package com.auribise.modal;

public class Customer {
   public static  String CustomerList = null;
public int cid;
   public String Name;
   public String Phone;
   public String Email;

   
   public Customer() {
	   
   }
  
   public Customer(int cid, String name, String phone, String email) {
	
	this.cid = cid;
	this.Name = name;
	this.Phone = phone;
	this.Email = email;
	
	
}


@Override
public String toString() {
	return "Customer [cid=" + cid + ", Name=" + Name + ", Phone=" + Phone + ", Email=" + Email + "]";
}
   
   
}
