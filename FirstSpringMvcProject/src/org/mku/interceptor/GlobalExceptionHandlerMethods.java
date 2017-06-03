package org.mku.interceptor;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethods {

	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
    String  handleNullPointerException(Exception e){
  	  
  	  //log the exception
  	  System.out.println("Null Pointer Exception Has Occured" +e);
  	  return "NullPointerException";
    }

	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=IOException.class)
    String  handleIoException(Exception e){
  	  
  	  //log the exception
  	  System.out.println("Io Exception has Occured" +e);
  	  return "ioException";
    }
	
	
}
