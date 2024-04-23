package com.kunaltut.kunalspring.error;
import java.lang.Exception;
@SuppressWarnings("serial")
public class DepartmentNotFoundException extends Exception{
	public DepartmentNotFoundException() {
		super();
	}
	
	public DepartmentNotFoundException(String message) {
		super(message);
	}
	
	public DepartmentNotFoundException(String message, Throwable cause) {
		super(message,cause);
	}
	
	public DepartmentNotFoundException( Throwable cause) {
		super(cause);
	}
	
	
	
}
