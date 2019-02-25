
public class Company {
	String compname;
	int branch;
    int departmentNo;
	 Address[] Employees;
	 Hiring[] fields;
	
	void setdataforCompany(String compname,int branch,int departmentNo,Address[] Employees, Hiring[] fields) {
		  
		   this.compname =compname;
		   this.branch = branch;
		   this.departmentNo =departmentNo ;
		   this.Employees=Employees;
		   this.fields = fields;
		   
	   }
	 void showdataforCompany() {
		   System.out.println("@@@@Company Details@@@@@@@");
		   System.out.println("Name: "+compname);
		   System.out.println("Branch: "+branch);
		   System.out.println("DepartmentNo: "+departmentNo);

		   
		   System.out.println("----Employees Details-----");
		   for(Address aRef : Employees) {
			   aRef.showEmpDetails();
		   }
		   System.out.println("---------------------------");
		   
		   System.out.println("#####Hiring Field Details######");
		   for(Hiring oRef :fields ) {
			   oRef.showdataforHiring();
		   }
		   System.out.println("#######################");
	 }
	 double totalEarning() {
		 double total= 0;
		 for(Hiring oRef : fields) {
			 total +=oRef.salary;
		 }
		 return total;
		 
	 }

}
