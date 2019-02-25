package com.auribises.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribise.modal.Customer;
import com.auribises.controller.DBHelper;

public class updateCustomerData implements   ActionListener{

	 Customer cRef;
	 JFrame updateFrame;
     JTextField txtName,txtPhone,txtEmail,txtId;
     JLabel lblTitle,lblName,lblPhone,lblEmail,lblId;
     JButton btnAddCustomer;
     JButton btnViewData;
     JButton btndeleteData;
     JButton btnupdateData;
     JPanel pnlTitle,pnlName, pnlPhone,pnlEmail,pnlButton,pnlId,pnlIdButton,pnlCustomerButton, pnlupdateButton,pnlAll;
     JButton buttonId,buttonUpdateDetails;
	 
     public updateCustomerData() {
    	
    	 updateFrame = new JFrame("Update Customer Details");
         pnlTitle = new JPanel();
         pnlId = new JPanel();
         pnlIdButton = new JPanel();
         pnlName = new JPanel();
         pnlPhone = new JPanel();
         pnlEmail = new JPanel();
         pnlupdateButton = new JPanel();
         pnlAll = new JPanel();

         lblTitle = new JLabel("Update Customer Details");
         lblId = new JLabel("Enter Customer ID ");
         lblName = new JLabel("Enter Customer Name");
         lblPhone = new JLabel("Enter Customer  Phone");
         lblEmail = new JLabel("Enter Customer Email");

         txtId = new JTextField(16);
         txtName = new JTextField(16);
         txtPhone = new JTextField(16);
         txtEmail = new JTextField(16);
        
         buttonId = new JButton("OK");
         buttonId.addActionListener(this);
         
         buttonUpdateDetails = new JButton("Update");
         buttonUpdateDetails.addActionListener(this);
     }
     public void showupdateCustomerData() {
    	 
    	 pnlTitle.add(lblTitle);
    	 pnlId.add(lblId);
    	 pnlId.add(txtId);
    	 pnlIdButton.add(buttonId);
         pnlName.add(lblName);
         pnlName.add(txtName);
         pnlPhone.add(lblPhone);
         pnlPhone.add(txtPhone);
         pnlEmail.add(lblEmail);
         pnlEmail.add(txtEmail);
         pnlupdateButton.add(buttonUpdateDetails);
  
         pnlAll.add(pnlTitle);
         pnlAll.add(pnlId);
         pnlAll.add(pnlIdButton);
         pnlAll.add(pnlName);
         pnlAll.add(pnlPhone);
         pnlAll.add(pnlEmail);
         pnlAll.add(pnlupdateButton);

         updateFrame.add(pnlAll);
         updateFrame.setSize(400, 400);
         updateFrame.setVisible(true);
         
     }
	@Override
	public void actionPerformed(ActionEvent e ) {
		int cid;
		if(e.getSource()==buttonId) {
         
		   cid=Integer.parseInt(txtId.getText());
			DBHelper db = new DBHelper();
			db.createConnection(); 
			Customer cRef=db.fetchSingleCustomer(cid);
			txtName.setText(cRef.Name);			
			txtPhone.setText(cRef.Phone);
			txtEmail.setText(cRef.Email);
			db.closeConnection();

		}
		
		if(e.getSource()==buttonUpdateDetails) {
			Customer cRef= new Customer();
			cRef.cid =  Integer.parseInt(txtId.getText());
			cRef.Name=txtName.getText();
			cRef.Phone=txtPhone.getText();
			cRef.Email=txtEmail.getText();
			System.out.println(cRef);
			DBHelper db = new DBHelper();
			db.createConnection();
			db.updateCustomerDetails(cRef);
			db.closeConnection();
		}
	}
         
  }
			


 
			


 
			

 
			


 
			

 
			


 
			

 
			

 
			
 



 



 
			


 
			


 
			

 
			

 
			

 

		
		
	



         
 		


  
 		
 		


  
 		

  
 		


  
 		


  
 		
 		

  
 		


  

  
 		


  
 		


  
 		


  
 		
  
 		


  
 		

  

    		


  
 		


  
 		

  

 		


  
 		


  
 		

  

  
 		


  
 		


  
 		
 		


  
 		


  
 		


  
 		


  
 		

  
 		


  
 		


  

	 
