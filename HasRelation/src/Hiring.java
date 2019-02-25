
public class Hiring {
   int fieldId;
   String fieldName;
   int salary;
   int dateOfHiring;
   
   void setdataforHiring(int fieldId,String fieldName,int salary,int dateOfHiring) {
	   this.fieldId = fieldId;
	   this.fieldName = fieldName;
	   this.salary = salary;
	   this. dateOfHiring =  dateOfHiring;
   }
   void showdataforHiring() {
	   System.out.println("$$$$$$Hiring Details$$$$$");
	   System.out.println("FieldId: "+fieldId);
	   System.out.println("FieldName: "+fieldName);
	   System.out.println("Salary: "+salary);
	   System.out.println("DateOfHiring: "+dateOfHiring);
	   System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
   }
}
