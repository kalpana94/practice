package com.auribises.modal;

public class Student {

	// modal or bean or POZO(plain old java object)
	int roll;
	String name;
	int age;
	
	public Student() {
		
	}

	public Student(int roll, String name, int age) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		}

	public void setDataforStudent(int roll, String name, int age) {
		
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	@Override // override is an annotation
	public String toString() {
		return "Student[roll =" + roll +",name=" + name + ", age=" +age+ "]";
		
		//return "Student[roll =" + roll +",name=" + name + ", age=" +age+ "] - "+super.toString();
		
        //  return roll +  "," + name + ","  +age+"\n";
        		   
	
		
		
	}

}
