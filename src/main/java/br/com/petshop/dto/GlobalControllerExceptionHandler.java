package br.com.petshop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

	
	
	
	@ResponseBody
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(value = { MethodArgumentNotValidException.class })
	public ErrorDto handleValidationExceptions(
	  MethodArgumentNotValidException ex) {
	    ErrorDto errorDto = new ErrorDto();
        List<String> lista = new ArrayList<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	       
	      
	        lista.add(errorMessage);
	       
	    });
	    
	    System.out.println("Lista: " + lista);
	    errorDto.setMensagem(lista);
	    return errorDto;
	}
	
}
