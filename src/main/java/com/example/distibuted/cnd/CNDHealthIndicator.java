package com.example.distibuted.cnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CNDHealthIndicator implements HealthIndicator {


    @Autowired
    CndController controller;
    @Override
    public Health health() {
        Health val = null;
        if(controller.restCount >= 10){
            val= Health.up().withDetail("Rest Count", controller.restCount).build();
        }else
        val= Health.down().withDetail("Error Code", 0).build();

        System.out.println("Health Is :"+val);
        return val;
    }
}
