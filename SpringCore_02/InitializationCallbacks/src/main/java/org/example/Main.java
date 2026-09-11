package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

/*  Bean lifecycle stage - Initialization Callbacks
-> Done after Aware Interface and Before using Beans
-> Used for assigning initial values to anything so that Bean is aware of everything
-> Can't initialize values through constructor, because Bean should be aware of those things before
    Bean can be used
-> These tasks are performed before business logic
-> 3 Ways of initializing callbacks: 1) InitializingBean Interface (Was used before)
                                     2) init(Used with @Bean)
                                     3) @PostConstruct (Widely Used)

    When I run this code:
    3 callbacks(prints Initialization Callback thrice) because you've enabled all 3 initialization mechanisms.
    A_Init because initMethod="start" executes last and overwrites the map values set by the previous callbacks.
    Flow -> @PostConstruct -> afterPropertiesSet -> initMethod
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getValue(1));

    }
}
