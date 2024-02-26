package com.example.sqch10ex7.controllers.advice;

import com.example.sqch10ex7.exceptions.NotEnoughMoneyException;
import com.example.sqch10ex7.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    @ExceptionHandler(NotEnoughMoneyException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to maje the payment.");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
