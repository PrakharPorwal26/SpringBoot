package org.example;

import org.example.paymentServices.PaymentService;
import org.example.paymentServices.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration //Tells spring that this is a configuration file
@ComponentScan("org.example") //Asks spring to scan Components in org.example package
public class AppConfig {

    @Bean //Spring runs the method defined below and adds the Bean created by user to the IoC contanier
    @Qualifier("UPI") // Multiple dependencies
    @Primary //Highest priority dependency
    public UpiPayment createUpiPayment(){
        return new UpiPayment();
    }

}
