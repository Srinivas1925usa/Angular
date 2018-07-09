package io.javabrains.exception;

public class BeanValidationException extends RuntimeException {

    public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

	public BeanValidationException(String message) {
        super(message);
        this.message = message;
    }

    public BeanValidationException(String message, Throwable cause) {
        super(message, cause);
    }
}
