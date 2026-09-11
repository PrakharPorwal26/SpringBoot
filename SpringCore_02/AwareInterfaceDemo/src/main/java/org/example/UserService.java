package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements BeanNameAware {

    @Override
    //Callback method - Spring calls this method for us
    public void setBeanName(String name) {
        System.out.println("Bean Name: " + name);
    }
}
