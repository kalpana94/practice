package com.auribises.view;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.auribise.modal.Customer;
import com.auribises.controller.DBHelper;

public class ShowCustomerDetails {
 JFrame detailsFr;
 JTable table;
 JScrollPane  scrollpane;
 ArrayList<Customer> CustomerList;
 Customer cRef;
 String  [][] customerListArray;
 String [] column = {"CustomerId", "Name","phoneNo","Email"};
 

 public void CreateShowDetailsWindow() {
	 detailsFr = new JFrame("Customer Details");
	 table = new JTable(customerListArray,column);
	 scrollpane = new JScrollPane(table);
	 
	  }

 public void ShowDetailsFrame() {
	 detailsFr.add(scrollpane);
	 detailsFr.setSize(500,500);
	 detailsFr.setVisible(true);
	 }
 
 public void showData() {
	 DBHelper db = new  DBHelper();
	 db.createConnection();
	 CustomerList = db.fetchCustomersFromDB();
	 db.closeConnection();
	 int sizeOfCustomerList = CustomerList.size();
	 int numOfColumns = 4;
	 int noOfColumns;
	customerListArray = new String[sizeOfCustomerList][numOfColumns];
	
	
	for(int i = 0;i<sizeOfCustomerList;i++) {
		cRef= CustomerList.get(i);
		customerListArray[i][0]= Integer.toString(cRef.cid);
		customerListArray[i][1]= cRef.Name;
		customerListArray[i][2]= cRef.Phone;
		customerListArray[i][3] = cRef.Email;
		
	}
	 
 }
 
 
}
