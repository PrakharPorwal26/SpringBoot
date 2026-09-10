package org.example.paymentServices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CARD")
public class CardPayment implements PaymentService {
    public void pay(){
        System.out.println("Payment done via Card");
    }
}
