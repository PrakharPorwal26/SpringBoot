package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
//InitializingBean Interface
public class UserService implements InitializingBean {

    Map<Integer, String> mp;
    public UserService() {
        mp = new HashMap<>();
        System.out.println("UserService constructor called");
    }
    //This is for Initializing Bean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization Callback");
        mp.put(1, "A");
        mp.put(2, "B");
    }

    //Creating this for init
    public void start(){
        System.out.println("Initialization Callback");
        mp.put(1, "A_Init");
        mp.put(2, "B_Init");
    }

    //This is for PostConstruct
    @PostConstruct
    public void start2(){
        System.out.println("Initialization Callback");
        mp.put(1, "A_PostConstruct");
        mp.put(2, "B_PostConstruct");
    }
    public void printUser(){
        System.out.println("This business logic will be called after Initialization Callback");
    }
    public String getValue(int key){
        return mp.get(key);
    }
}
