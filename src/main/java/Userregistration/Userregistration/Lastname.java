package Userregistration.Userregistration;

import java.util.regex.Pattern;

public class Lastname {

	public boolean validateLastName(String lName) {
		String lastName = "^[A-Z]{1}[a-zA-Z]{2,}$";
		boolean result = Pattern.matches(lastName, lName);
		return result;
	}

}