package com.example.sqch10ex7.service;

import com.example.sqch10ex7.exceptions.NotEnoughMoneyException;
import com.example.sqch10ex7.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
