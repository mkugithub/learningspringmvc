package org.mku.model;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String> {

		private  String listOfValidHobbies;
		
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidHobbies=isValidHobby.listOfValidHobbes();
			
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext ctx) {
		
		if(studentHobby==null){
		
			return false;
			
		}
		
		if(studentHobby.matches(listOfValidHobbies))
		{
			return true;
		
	    }
		else{
			return false;
		}
	}
}
