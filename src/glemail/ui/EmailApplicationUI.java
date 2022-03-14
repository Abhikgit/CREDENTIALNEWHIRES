package glemail.ui;

import java.util.Scanner;

public class EmailApplicationUI {
	public void init () {
		Employee employee = buildUI();
		callService(employee);
		
	}
	private Employee buildUI() {
		buildWelcomeSection();
		Employee employee = buildEmployeeDetailsSection();
		return employee;
		
	}
	private void buildWelcomeSection() {
		System.out.print("*****************************");
		System.out.print("Welcome to Email ");
		System.out.print("***********************");
		
	}
	private Employee buildEmployeeDetailsSection() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter employee's first name: ");
		String firstname = userInput.nextLine();
		System.out.println("Enter employee's last name: ");
		String lastrname = userInput.nextLine();
		System.out.println("Employee's departmenrt ");
		System.out.println("1.Tecnical");
		System.out.println("2. Admin");
		System.out.println("3.Human Resourcee");
		System.out.println("4.Legal");
		System.out.println("Select 1/2/3/4 for employee's department");
		
		int departmentID = userInput.nextInt();
		String departmentName = getDepartmentName (departmentID);
		Employee employee = new Employee(firstname,lastName,departmentName);
		
		userInput.close();
		return employee;
	}
	
	private String get DepartmentName(int DepartmentID) {
		if (departmentID == 1) {
			return "Technical";
		}else if (departmentID == 2) {
			return "Admin";
		}else if (departmentID == 3) {
			return "Human Resource";
		}else if (departmentID == 4) {
			return "Legal";
		}else {
			return "";
			
		}
	}
	private void callService(Employee employee) {
		CredentialGenerator generator = new CredentialGenerator(employee);
		generator.generateEmailID();
		generator.generatePassword();
		
		generator.showCredentials();
		
	}

}
