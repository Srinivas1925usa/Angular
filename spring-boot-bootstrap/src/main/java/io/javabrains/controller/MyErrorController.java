/*package io.javabrains.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.servlet4preview.RequestDispatcher;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MyErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";																				
	}
	
	 @GetMapping(value = "/error")
	
	public String handleError(HttpServletRequest request) {
		
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		
		if (status!=null) {
			
			Integer statuscode= Integer.valueOf(status.toString());

			if (statuscode == HttpStatus.NOT_FOUND.value()) {
			
			return "error-404";
		}
			else if(statuscode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
	            return "error-500";
		}
	}
		return "error";
	}
}
*/