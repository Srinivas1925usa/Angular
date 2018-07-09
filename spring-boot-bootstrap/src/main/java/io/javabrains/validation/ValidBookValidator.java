package io.javabrains.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import io.javabrains.exception.BeanValidationException;
import io.javabrains.model.Book;

import static org.apache.commons.lang3.StringUtils.isEmpty;

public class ValidBookValidator implements ConstraintValidator<ValidBook, String> {
	 
   	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
   		
   		   		
   	 if (isEmpty(value)) {
         return false;
     }
   	
   	if (value.equals("Srinivas")||value=="Srinivas") {
	      
	return true;
	
   	}
	return false;
	
   	}
}
