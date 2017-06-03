package org.mku.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DaysOfWeekBasedAccessInterceptor  extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		//if this method return true then -application will further handle request 
		//if this method return false then -application will not further handle request 
		
		Calendar cal=Calendar.getInstance();
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);//getting the day of week on which request is made.
		
		if(dayOfWeek==1)
		{
			response.getWriter().write("The website is closed of Sunday, Please try accessing it on any other week days!!!");
			//return false;
			return true;
		}
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//this method is called right after controller handler method is called.
		System.out.println("Spring MVC has called the postHandle method" +request.getContextPath());
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		//This method is called after view preparation is done.
		System.out.println("Spring MVC has called the aferCompletion method" +request.getContextPath());
	}

	

}
