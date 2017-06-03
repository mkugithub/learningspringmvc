package org.mku.model;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport {
	
	//When you will submit the student admission form , Spring mvc will run setAsText for this class
	//before perfoming the data binding task for studentName property.
	
	@Override
	public void setAsText(String studentName) throws IllegalArgumentException {
		
	if(studentName.contains("Mr")||studentName.contains("Ms")){
			setValue(studentName);
		
		}
	else{
		
		studentName="Ms."+studentName;
		setValue(studentName);
		
		}
	
	}
	
	

}
