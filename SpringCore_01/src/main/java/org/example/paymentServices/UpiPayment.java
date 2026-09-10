package org.example.paymentServices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class UpiPayment implements PaymentService {
    public void pay(){
        System.out.println("Payment done via UPI");
    }
}
