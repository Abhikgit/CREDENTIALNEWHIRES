package gl.email.service;

import java.util.Random;

import gl.emailset.Employee;


public class Credentialgenerator {
	private Employee employee;
	private String generatedEmailID;
	private char[] generatedPassword = new char[8];
	public Credentialgenerator(Employee employee) {
		this.employee = employee;
	}
	public void generatedEmailID() {
		String departmentShortName = getDepartmentShortName();
		String emaiID = employee.getFirstname().toLowerCase()+"."+ employee.getLastment().toLowerCase()+"@"+ departmentShortName + ".gl.com";
		this.generatedEmailID = emailID;
		
	}
	private String getDepartmentShortName() {
		String departmentName = employee.getDepartment();
		if (departmentName.equals("Technical")) {
			return "tech";
		} else if (departmentName.equals("Admin")) {
			return  "adm";
		} else if (departmentName.equals("Human Resource")) {
			return "hr";
		} else if (departmentName.equals("Legal")) {
			return "lgl";
		}
		return "";
	}
	public void generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		String allValues = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random randomObj = new Random();
		
		for (int i=0; i<8; i++) {
			int boundValue = allValues.length();
			int randomIndex = randomObj.nextInt(boundValue);
			char randomChar = allValues.charAt(randomIndex);
			this.generatedPassword[i]=randomChar;
			
		}
	}
	public void showCredentials() {
		System.out.print("Dear" + employee.getFirstname()+ ", ");
		System.out.println("Your generated credentials are as follows");
		System.out.println("Email ID: " + generatedEmailID);
		System.out.print("Password:");
		System.out.println("generatedPassword");
	}

}
