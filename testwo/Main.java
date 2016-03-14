package testwo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		warehouseworker Jim = new warehouseworker ("Jim", "Harper", "Warehouse Employee", 20.50, 47, "Hourly", "None");
		warehouseworker Daryl = new warehouseworker ("Daryl", "Philman", "Warehouse Supervisor", 26.50, 52, "Hourly", "A-O");
		warehouseworker Phil = new warehouseworker ("Phil", "Lewis", "Warehouse Supervisor", 25.50, 52, "Hourly", "P-Z");
		Customerservice Pam = new Customerservice ("Pam", "Beasley", "Secretary", 13000, "Salary");
		Customerservice Erin = new Customerservice ("Erin", "Yoka", "Secretary", 12500, "Part Time / Salary");
		HR Jan = new HR ("Jan", "Levinston", "District Manager", 85000, "Salary");
		HR Ryan = new HR ("Ryan", "Howard", "Junior District Manager", 65000, "Salary");
		Management Michael = new Management ("Michael", "Scott", "Regional Manager", 65000, "Salary");
		Management David = new Management ("David", "Wallace", "Executive Manager", 350000, "Salary");
		Jim.calculatepay();
		Daryl.calculatepay();
		ArrayList <warehouseworker> warehouseguys = new ArrayList<warehouseworker>();
		warehouseguys.add(Daryl);
		warehouseguys.add(Jim);
		warehouseguys.add(Phil);
		for (warehouseworker item : warehouseguys){
			System.out.println(item.firstname + " " + item.lastname + " " + item.takehome + " " + item.title + " " + item.wage + " " + item.employementstatus + " " + item.supervisorlist);}
		ArrayList <Customerservice> customerservicerep = new ArrayList <Customerservice> ();
		customerservicerep.add(Pam);
		customerservicerep.add(Erin);
		for (Customerservice item : customerservicerep) {
			System.out.println(item.firstname + " " + item.lastname + " " + item.title + " " + item.salary + " " + item.employementstatus); }
		ArrayList <HR> corporate = new ArrayList <HR>();
		corporate.add(Jan);
		corporate.add(Ryan);
		for (HR item : corporate) {
			System.out.println(item.firstname + " " + item.lastname + " " + item.title + " " + item.salary + " " + item.employementstatus);}
		ArrayList <Management> managers = new ArrayList<Management>();
		managers.add(Michael);
		managers.add(David);
		for (Management item : managers) {
			System.out.println(item.firstname + " " + item.lastname + " " + item.title + " " + item.salary + " " + item.employementstatus);
		}
		
			 
			
		

	

}

}