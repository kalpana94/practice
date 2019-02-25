
public class Address {
String fresname;
String qualification;
String address;
String label;
int postalcode;
int mobileno;

void setEmpDetails(String fresname,String qualification,String address,String label,int postalcode,int mobileno) {
	this.fresname=fresname;
	this.qualification=qualification;
	this.address=address;
	this.label=label;
	this.postalcode=postalcode;
	this.mobileno=mobileno;
}
void showEmpDetails() {
	System.out.println("%%%%%%%Employee Details%%%%%%%%");
	System.out.println("fresname:"+fresname);
	System.out.println("qualification:"+qualification);
	System.out.println("address:"+address);
	System.out.println("label:"+label);
	System.out.println("postalcode:"+postalcode);
	System.out.println("mobileno:"+mobileno);
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");

}
}
