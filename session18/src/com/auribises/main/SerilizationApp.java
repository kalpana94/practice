package com.auribises.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import com.auribises.modal.Student;

import java.io.ObjectInputStream;

public class SerilizationApp {

	public static void main(String[] args) {
		//Student sRef1 = new Student(101,kapil,26);
		//Student sRef2 = new Student(102,"kasis",28);
		//Student sRef3 = new Student(103,"kalpana",25);
		try {
			File file =  new File("C:/Users/hp/eclipse-workspace/session18/src/com/auribises/controller/mystudent.dat");
			
			//FileOutputStream out = new FileOutputStream(file);
			//Serialization : writing state of an object in file directory.
			// state of an object means data in object
			/*ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(sRef);
			oos.close();
			out.close();
			System.out.println(">> object written in file");*/
			
			FileInputStream in = new FileInputStream(file); 
			
			// De-Serialization reading state of an object from file and creating an object
			ObjectInputStream ois= new ObjectInputStream(in);
			Student sRef = (Student)ois.readObject();
			System.out.println("sRef");
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}
