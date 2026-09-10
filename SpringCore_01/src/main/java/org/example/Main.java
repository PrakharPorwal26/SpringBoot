package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* Creating Spring IoC (Inversion of Context) Container and giving it
        metadata of AppConfig which provides rules and regulations for the Bean creation */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
    }
}
