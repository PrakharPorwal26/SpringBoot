package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*  Bean lifecycle stage - Destruction Callbacks
-> Done when Spring Container is shutting down
-> Used for releasing resources before bean is destroyed
-> Examples:
      - Closing Database Connections
      - Closing Files/Streams
      - Releasing Network Resources
      - Cleaning Caches
-> These tasks are performed after business logic is completed
-> 3 Ways of destruction callbacks:
      1) DisposableBean Interface (Was used before)
      2) destroyMethod (Used with @Bean)
      3) @PreDestroy (Widely Used)

    Important:
    -> Destruction callbacks are executed only when the Spring Container is closed.
    -> For this reason we use ConfigurableApplicationContext and call close().

    When I run this code:
    3 callbacks (prints Destroy Callback thrice) because you've enabled all 3 destruction mechanisms.

    Flow -> @PreDestroy -> destroy() -> destroyMethod
 */

public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);
        System.out.println(userService.getValue(1));

        context.close();
    }
}