package com.rumeysa.ilk_spring_projem.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleValidationErrors(MethodArgumentNotValidException ex){
		
		Map<String, String> hatalar = new HashMap<>();
		
		ex.getBindingResult().getAllErrors().forEach((error) -> {
			
			String alanAdi =((FieldError) error).getField();
			String hataMesaji = error.getDefaultMessage();
			hatalar.put(alanAdi, hataMesaji);
			
		});
		
		
		return new ResponseEntity<>(hatalar, HttpStatus.BAD_REQUEST);
		
	}

}
