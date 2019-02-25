package com.auribises.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.auribises.controller.DBHelper;

public class deleteCustomerData  implements  ActionListener{
	JFrame deleteFrame;
	
	JPanel panelAll;
	JPanel panelTitle;
	JPanel panelId;
	JPanel paneldeleteButton;
	
	JLabel labelTitle;
    JLabel labelsId;
    
    JButton buttondelete;
    JTextField txtId;
	
    deleteCustomerData(){
    	deleteFrame = new JFrame();
    	panelAll = new JPanel();
    	panelTitle = new JPanel();
    	panelId = new JPanel();
    	paneldeleteButton = new JPanel(); 
    	labelTitle = new JLabel("Delete Customer");
    	labelsId = new JLabel("Enter Customer ID");
    	buttondelete = new JButton("Delete Customer");
    	buttondelete.addActionListener(this);
    	txtId = new JTextField(16);	
    }
    public void ShowDeleteCustomerWindow() {

    	panelTitle.add(labelTitle);
    	panelId.add(labelsId);
    	panelId.add(txtId);
    	paneldeleteButton.add(buttondelete);
    	panelAll.add(panelTitle);
    	panelAll.add(panelId);
    	panelAll.add(paneldeleteButton);
    	GridLayout layout = new GridLayout(4,1);
    	panelAll.setLayout(layout);
    	deleteFrame.add(panelAll);
    	deleteFrame.setSize(400,400);
    	deleteFrame.setVisible(true);

    	 }
    @Override

      public void actionPerformed(ActionEvent e) {
        
    	if(e.getSource()==buttondelete) {

    		int cid= Integer.parseInt(txtId.getText());

			DBHelper DB = new DBHelper();
			DB.createConnection();

			System.out.println(cid);
			DB.deleteCustomerFromDB(cid);
			DB.closeConnection();


		}
}

}

 
			


 


 
			

 
 
			

 
			

 
    	 
		

 
		

 
		

 
		

 
		


 
		

 
		


 



 
		


 
		

 



 
		

 
		

 



 
	
		
    	 
		

 



 
		


 
		

 



 
		
   


 
		


 
		
    	
   