package io.javabrains.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import io.javabrains.exception.BeanValidationException;

public class SimpleValidation {
	
	
	 public static <T> void validate(T object) {

	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        Validator validator = factory.getValidator();
	        System.out.println("validate reached");
	        Set<ConstraintViolation<T>> validatorSet = validator.validate(object);
	        System.out.println("validate reached2");
	        validatorSet.forEach(cv -> {
	        	System.out.println(cv.getPropertyPath()+"PropertyPath"+cv.getMessage()+"message");
	            throw new BeanValidationException(cv.getPropertyPath() + " - " + cv.getMessage());
	            
	        });
	    }

}
