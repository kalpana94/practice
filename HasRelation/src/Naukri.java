
public class Naukri {

	public static void main(String[] args) {
	 Address[] a1 = new Address[3];
	 for(int i=0;i<a1.length;i++) {
		 a1[i] = new Address();
	 }
	 a1[0].setEmpDetails("Amit","BSC-IT","RedFort","home",141001,823415671);
	 a1[1].setEmpDetails("sunita","MSC-IT","Civil LINES","office",121001,76345278);
	 a1[2].setEmpDetails("kanika","BETECH","chandan nager","uncle",121002,923467891);
		
	
	 
	 Hiring[] h1 = new Hiring[3];
	 for(int i=0;i<h1.length;i++) {
		 h1[i] = new Hiring();
	 }
	 h1[0].setdataforHiring(11,"HR",20000,20-02-2019);
	 h1[1].setdataforHiring(13,"IT",40000,21-01-2019);
	 h1[2].setdataforHiring(11,"Account",25000,22-02-2019);
	 
	 
	 Company c1 = new Company();
	 
	 c1.setdataforCompany("Mehendra",2,10,a1,h1);
	 c1.showdataforCompany();
	 
	 
	 System.out.println(">>>>>>>>>>>>>>>");
	 System.out.println(c1.compname+"gives \u20b9"+c1.totalEarning());
	 System.out.println(">>>>>>>>>>>>>>>");
	}

}
