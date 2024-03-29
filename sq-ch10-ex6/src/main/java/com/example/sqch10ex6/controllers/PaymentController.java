package com.example.sqch10ex6.controllers;

import com.example.sqch10ex6.exceptions.NotEnoughMoneyException;
import com.example.sqch10ex6.model.ErrorDetails;
import com.example.sqch10ex6.model.PaymentDetails;
import com.example.sqch10ex6.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment() {
       PaymentDetails paymentDetails = paymentService.processPayment();
       return ResponseEntity
               .status(HttpStatus.ACCEPTED)
               .body(paymentDetails);
    }
}
