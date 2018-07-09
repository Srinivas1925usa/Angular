package io.javabrains.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = ValidBookValidator.class)
@Target({ METHOD, CONSTRUCTOR, FIELD })
@Retention(RUNTIME)
@Documented
public @interface ValidBook {
	
	String value();
    String message() default "must provide Book Author Name";
 
    Class<?>[] groups() default {};
 
    Class<? extends Payload>[] payload() default {};
}