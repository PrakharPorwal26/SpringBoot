package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserService implements InitializingBean, DisposableBean {

    Map<Integer, String> mp;

    public UserService() {
        mp = new HashMap<>();
        System.out.println("UserService constructor called");
    }

    // InitializationBean
    @Override
    public void afterPropertiesSet() {
        System.out.println("Initialization Callback");
        mp.put(1, "A");
        mp.put(2, "B");
    }

    // initMethod
    public void start() {
        System.out.println("Initialization Callback");
        mp.put(1, "A_Init");
        mp.put(2, "B_Init");
    }

    // PostConstruct
    @PostConstruct
    public void start2() {
        System.out.println("Initialization Callback");
        mp.put(1, "A_PostConstruct");
        mp.put(2, "B_PostConstruct");
    }

    // DisposableBean
    @Override
    public void destroy() {
        System.out.println("Destroy Callback");
        mp.clear();
    }

    // destroyMethod
    public void stop() {
        System.out.println("Destroy Callback");
        mp.clear();
    }

    // PreDestroy
    @PreDestroy
    public void stop2() {
        System.out.println("Destroy Callback");
        mp.clear();
    }

    public String getValue(int key) {
        return mp.get(key);
    }
}