package com.auribises.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.auribise.modal.Customer;

public class DBHelper {
	 Connection con;
     PreparedStatement pstmt;
	public DBHelper() {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println(">>Driver Loaded");
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	 
 }
	public void createConnection() {
		try {
			String url ="jdbc:mysql://localhost/database1";
			String user = "root";
			String password ="";
					
		 con = DriverManager.getConnection(url,user,password);
		 System.out.println("$$$Connection created");
		} catch (Exception e) {
			
			e.printStackTrace();	
	}
	
	
	}
	public int AddCustomerInDB(Customer cRef) {
		int i=0;
		try {
			
			String sql = "Insert into customer values(null,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,cRef.Name);
			pstmt.setString(2,cRef.Phone);
			pstmt.setString(3,cRef.Email);
			
			
			 i = pstmt.executeUpdate();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return i;
	}
	public Customer fetchSingleCustomer(int id) {

		Customer cRef = new Customer();
		 
		try {

			String sql="select * from customer where cid="+id+"";
			pstmt=con.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				cRef.cid=rs.getInt(1);
				cRef.Name=rs.getString(2);
				cRef.Phone=rs.getString(3);
				cRef.Email=rs.getString(4);
			}


		}
		catch(Exception e) {
			e.printStackTrace();


		}

		return cRef;
	}


   public ArrayList<Customer> fetchCustomersFromDB(){
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		try {
			String sql = "select * from customer";
			pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Customer cRef = new Customer();
				cRef.cid=rs.getInt(1);
				cRef.Name=rs.getString(2);
				cRef.Phone=rs.getString(3);
				cRef.Email=rs.getString(4);
				customerList.add(cRef);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return customerList;
	}
	public void updateCustomerDetails(Customer cRef) {
		try {
		int i = 0;
		String sql = "update customer set name=?,phone=?,email=? where cid=?";
		
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, cRef.Name);
			pstmt.setString(2, cRef.Phone);
			pstmt.setString(3, cRef.Email);
			pstmt.setInt(4, cRef.cid);
			i=pstmt.executeUpdate();
			if(i>0) {
				System.out.println(cRef.Name+"Updated");
			}else {
				System.out.println(cRef.Name+"Not Updated");
			}
			
					
		}
			catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void deleteCustomerFromDB(int id) {

	try {

        String sql="delete from customer where cid=?";

        pstmt=con.prepareStatement(sql);

        pstmt.setInt(1, id);
        int i=pstmt.executeUpdate();

        if(i>0) {

        System.out.println("ID : "+id+" Deleted");
        }else {

         System.out.println("ID : "+id+" Not Deleted");
         }
        }
        catch(Exception e){
                 
        	e.printStackTrace();

      }
	}
		         
	 public void closeConnection() {
		try {
			con.close();
			System.out.println("Connection Closed");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
		
		
		
	}

	
	



