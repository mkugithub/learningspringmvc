package org.mku.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=HobbyValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)


public @interface IsValidHobby {

	String listOfValidHobbes() default "Music|Footbal|Cricket|Hockey";
	String message() default "Please provide a valid Hobby;" +
	"Accepted hobbies are -Music, Footbal,Cricket and Hockey(Choose anyone)";
	Class<?>[] groups() default {};
	Class<? extends Payload>[] payload() default {}; 
	
	
}
