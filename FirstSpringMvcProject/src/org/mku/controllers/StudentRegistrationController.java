package org.mku.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.mku.model.Student;
import org.mku.model.StudentNameEditor;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentRegistrationController {
	
	@InitBinder
	public void InitBinder(WebDataBinder dataBinder){
		//dataBinder.setDisallowedFields(new String [] {"studentMobile"});
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd***mm***yyyy");
		//dataBinder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		dataBinder.registerCustomEditor(String.class,  "studentName", new StudentNameEditor());
	}
	
	

	@RequestMapping(value="/admissionForm.html",  method=RequestMethod.GET)
	public ModelAndView getAdmissionForm() throws Exception {
		
		//String exceptionOccured="NULL_POINTER";
		String exceptionOccured="IO_Exception";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")){
			
			throw new NullPointerException();
		} else if(exceptionOccured.equalsIgnoreCase("IO_Exception")){
			
			throw new IOException();
			
		}
				
		
		ModelAndView mav = new ModelAndView("AdmissionForm");
		return mav;

	}
		
		@RequestMapping(value="/submitAdmissionForm.html",  method=RequestMethod.POST)
		public ModelAndView submitAdmissionForm(@Valid@ModelAttribute("student1") Student student1, BindingResult result) {
		
			if(result.hasErrors()){
				ModelAndView mav = new ModelAndView("AdmissionForm");
				return mav;
			}
			
		ModelAndView mav = new ModelAndView("AdmissionSuccess");
			
		  return mav;

	}

	
	//poc for requestparam
	/*@RequestMapping(value="/submitAdmissionForm.html",  method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			@RequestParam("studentHobby") String hobby,
			@RequestParam("studentMobile") String mobile,
			@RequestParam("studentDOB") String dob,
			@RequestParam("studentSkills") String[] skills) {
		
		    Student student=new Student();
		    try{
		     student.setStudentName(name);
		     student.setStudentHobby(hobby);
		    	
		    SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		     student.setStudentDOB(sdf.parse(dob));
		     student.setStudentMobile(Long.parseLong(mobile));
		     
		     List<String> studentSkillList=new ArrayList<String>();
		     
		     for(int i=0;i<skills.length;i++){
		    	 
		    	 studentSkillList.add(skills[i]);
		     }
		    	
		    	student.setStudentSkills(studentSkillList);
		    	
		    } catch(Exception e){
		    	
		    	System.out.println(e.toString());
		    	
		    }
			
	
	ModelAndView mav = new ModelAndView("AdmissionSuccess");
		mav.addObject("student1", student);
	  return mav;

}*/

	
	@ModelAttribute
	public void addingCommonObjects(Model model){
		model.addAttribute("headerMessage", "Pune College of Engineering ,India");
		model.addAttribute("s", "hi ");
	}
	
	//method for handling rest api
	  @ResponseBody
	  @RequestMapping(value="/students", method=RequestMethod.GET)
	  List<Student>getStudentsList(){
		List<Student> studentList=new ArrayList<>();
		Student std1=new Student();
		Student std2=new Student();
		Student std3=new Student();
		
		std1.setStudentName("The great Khali");
		std2.setStudentName("Rame");
		std3.setStudentName("Shyam Khatu Wale");
		studentList.add(std1);
		studentList.add(std2);
		studentList.add(std3);
		return studentList;	  
		  
	  }
	
	
	
	
		  	
}