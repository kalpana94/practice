package com.auribises.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;


// IOHelper is going to help us process data in files
public class IOHelper {
	
	public void writeDataInFile(String data) {
		try {
			File file = new File("mystudent.csv");
			//FileOutputStream out = new FileOutputStream(file);
			FileOutputStream out = new FileOutputStream(file,true); // append mode enabled
			out.write(data.getBytes());
			out.close();
			
			//FileWriter writer = new FileWriter(file);
			//FileWriter writer = new FileWriter(file,true);
			//writer.write(data);
			//writer.close();
			
			System.out.println(">>data written in "+file.getName());
			
			} catch (Exception e) {
				System.out.println("Some exception:"+e);
			   e.printStackTrace();
		}

		
		
	}
}
	/*public void readDataFromFile() {
		try {
			File file = new File("mystudent.csv");
		    /*FileInputStream in = new FileInputStream(file);
		    
		    int i = 0;
		    while((i = in.read()) !=-1){
		    	char ch = (char)i;
		    	System.out.println(ch);
		    	}
		    in.close();*/
		   /* FileReader reader = new FileReader(file);
		    BufferedReader buffer   = new BufferedReader(reader);
		    
		    String line = "";
		    int count = 0;
		    while((line = buffer.readLine()) != null){
		    	String[] arr = line.split(",");
		    	System.out.println(arr[0]+" | "+arr[1]+" | "+arr[2]);
		    	//System.out.println(line);
		    }
		    buffer.close();
		    reader.close();
		   } catch (Exception e) {
			e.printStackTrace();
			
		}
	}*/

/* public void readJvaFile() {
	 try {
			File file = new File("C:/Users/hp/eclipse-workspace/session18/src/com/auribises/controller/mystudent.csv");
		    FileReader reader = new FileReader(file);
		    BufferedReader buffer   = new BufferedReader(reader);
		    
		    String line = "";
		    int count = 0;
		    while((line = buffer.readLine()) != null){
		    	System.out.println(line);
		    	if(line.contains("new") && !line.startsWith("//")) {
		    		count++;
		    	}
		    }
		    System.out.println(count+" object found !!");
		    buffer.close();
		    reader.close();
	 }catch (Exception e) {
			e.printStackTrace();
			
		}
		    
		}
	 
 }
		*/

	


