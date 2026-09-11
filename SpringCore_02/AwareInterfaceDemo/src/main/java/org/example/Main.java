package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
-> Bean Lifecycle - AwareInterface
-> Can be used to get details of Bean/ IoC for logging purposes etc.
-> This stage comes after Dependency Injection but before Bean Initialization
-> Whichever class implements these interfaces, have to implement their methods.
-> These methods are called Callback methods, Spring automatically calls them for us.
 */
public class Main {
    public static void main(String[] args) {
            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            /* We don't have to get the Bean of UserService, Spring automatically eagerly instantiates
            its object. If we do this:

            UserService userService = context.getBean(UserService.class)
            userService.setBeanName("XYZ")

            This will print on console as Bean Name: XYZ, but in reality Bean's name won't change.
            Bean's name can change only when we explicitly mention Component("XYZ").

            */
        }
    }
