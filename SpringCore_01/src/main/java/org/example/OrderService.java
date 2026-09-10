package org.example;

import org.example.paymentServices.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //Spring should scan and add beans
public class OrderService {
    private PaymentService paymentService;

    @Autowired //automatically wires OrderService and PaymentService Object
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order placed");
    }
}
