package testwo;

public class warehouseworker extends Person {
	double wage;
	double hoursworked;
	double takehome;
	String supervisorlist;
	
public warehouseworker (String firstName, String lastName, String Title, double Wage, double hoursWorked, String employementStatus, String supervisorList){
	firstname = firstName;
	lastname = lastName;
	title = Title;
	wage = Wage;
	hoursworked = hoursWorked;
	employementstatus = employementStatus;
	supervisorlist = supervisorList;
}

public double calculatepay (){
	takehome = wage * hoursworked;
	return takehome;
	
}
	
	

}
