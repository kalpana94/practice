package com.auribises.main;

import com.auribises.controller.IOHelper;
import com.auribises.modal.Student;

public class App {

	public static void main(String[] args) {
		Student sRef1 = new Student();
		Student sRef2 = new Student(101,"kasis",28);
		Student sRef3 = new Student();
		
		//sRef1.roll=100;
		//sRef1.setRoll(100);
		//sRef1.setName("kapil");
		//sRef1.setAge(27);
		
		//sRef3.setDataforStudent(102,"kanika",27);
		
		//we have data of object in string format
		String s1 = sRef1.toString();
		String s2 = sRef2.toString();
		String s3 = sRef3.toString();
		
		//System.out.println("sRef1 is:"+sRef1);
		//System.out.println("sRef2 is:"+sRef2);
		//System.out.println("sRef3 is:"+sRef3);
		
		
		//System.out.println(s1);
		//System.out.println(s2);
		//System.out.println(s3);
		
		//objects constructed above are temporary. data in object can be lost
		//when program will finishes objects will be removed and data will be lost
		
		// we need to persist data somewhere.
		//we must save data
		//1.files
		//2.database(DB is also a file)
		
		IOHelper iRef = new IOHelper();
		iRef.writeDataInFile(s1);
		iRef.writeDataInFile(s2);
		iRef.writeDataInFile(s3);
		
		//iRef.readDataFromFile();
		//iRef.readJavaFile();
	}
}
