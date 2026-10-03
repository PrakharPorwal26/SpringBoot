package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        //get bean by id/name:
        OrderService order = (OrderService) context.getBean("orderServiceBean");
        order.placeOrder();

        //get bean by type -- works only for 1 bean, not for multiple beans, will not know which bean
        // to use, will throw NoUniqueBeanDefinitionException:
//        OrderService order1 = context.getBean(OrderService.class);
//        order1.placeOrder();

        //get bean by id and type, works for multiple beans -- best way!
        OrderService orderService1 = context.getBean("orderService1", OrderService.class);
        orderService1.placeOrder();
    }
}
