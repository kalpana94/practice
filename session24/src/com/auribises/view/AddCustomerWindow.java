package com.auribises.view;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribise.modal.Customer;
import com.auribises.controller.DBHelper;


public class AddCustomerWindow implements ActionListener {
     JFrame fr;
     JLabel lblTitle,lblName,lblPhone,lblEmail;
     JTextField txtName,txtPhone,txtEmail;
     JButton btnAddCustomer;
     JButton btnViewData;
     JButton btndeleteData;
     JButton btnupdateData;
     JPanel pnlTitle,pnlName, pnlPhone,pnlEmail,pnlButton,pnlAll;
     
     public AddCustomerWindow() {
    	 fr = new JFrame("Add Customer");
    	 
    	 lblTitle = new JLabel("Enter Customer Details");
    	 lblName = new JLabel("Enter Customer Name");
    	 lblPhone = new JLabel("Enter Customer Phone");
         lblEmail = new JLabel();
         lblEmail.setText("Enter Customer Email");
         
         txtName = new JTextField(16);
         txtPhone = new JTextField(16);
         txtEmail = new JTextField(16);
         
         btnAddCustomer = new JButton("Add Customer");
         
         btnAddCustomer.addActionListener(this);
         btnViewData = new JButton("ShowDetails");
         btnViewData.addActionListener(this);
        
         
         btndeleteData = new JButton("DeleteDetails");
         btndeleteData.addActionListener(this);
       
         
         btnupdateData = new JButton("UpdateDetails");
         btnupdateData.addActionListener(this);
         
         
         
         pnlTitle  =   new JPanel();
         pnlName   =   new JPanel();
         pnlPhone  =   new JPanel();
         pnlEmail  =   new JPanel();
         pnlButton =  new JPanel();
         pnlAll    =  new JPanel();
         
          }
    public void showWindow() {
    	 pnlTitle.add(lblTitle);
    	
    	 pnlName.add(lblName);
    	 pnlName.add(txtName);
    	 
    	 pnlPhone.add(lblPhone);
    	 pnlPhone.add(txtPhone);
    	 
    	 pnlEmail.add(lblEmail);
    	 pnlEmail.add(txtEmail);
    	 
    	 pnlButton.add(btnAddCustomer);
    	 pnlButton.add(btnViewData); 
    	 pnlButton.add(btndeleteData);
    	 pnlButton.add(btnupdateData);
    	
         pnlAll.add(pnlTitle);
    	 pnlAll.add(pnlName);
    	 pnlAll.add(pnlPhone);
    	 pnlAll.add(pnlEmail);
    	 pnlAll.add(pnlButton);
    	 
    	 GridLayout layout =  new GridLayout(5,1); 
    	 pnlAll.setLayout(layout);
    	 
    	 fr.add(pnlAll);
    	 
    	 fr.setSize(600,600);
    	 fr.setVisible(true);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnAddCustomer) { 
			Customer cRef= new Customer();
			cRef.Name = txtName.getText();
			cRef.Phone=txtPhone.getText();
			cRef.Email=txtEmail.getText();
			System.out.println(cRef);
			
			DBHelper db = new DBHelper();
			db.createConnection();
			int i = db.AddCustomerInDB(cRef);
			db.closeConnection();
			
			if(i>0) {
				System.out.println(">>"+cRef.Name);
				txtName.setText("");
				txtPhone.setText("");
				txtEmail.setText("");
				
				
			}else {
				System.out.println(">>"+cRef.Name+" not Added")	;
			}
		}
		
				 
					
		if(e.getSource()==btnViewData) {
			ShowCustomerDetails sRef = new ShowCustomerDetails ();
			sRef.showData();
			sRef.CreateShowDetailsWindow();
			sRef.ShowDetailsFrame();
		}
	
	
		if(e.getSource()==btnupdateData) {
		  updateCustomerData updatewindow = new updateCustomerData();
			updatewindow .showupdateCustomerData();
		}
		
		if(e.getSource()==btndeleteData) {
         deleteCustomerData deleteWindow = new deleteCustomerData();
         deleteWindow.ShowDeleteCustomerWindow();
         }
		
	}
}

