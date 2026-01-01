package com.example.resilence4j;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private int counter = 0;

    @CircuitBreaker(name = "demoCB", fallbackMethod = "fallback")
    public String unstableMethod() {
        counter++;
        System.out.println("System Counter Count : " +  counter);

        if (counter <= 3) {
            System.out.println("❌ Failing call " + counter);
            throw new RuntimeException("Simulated failure");
        }

        System.out.println("✅ Success call " + counter);
        return "SUCCESS";
    }

    public String fallback(Exception ex) {
        return "FALLBACK RESPONSE";
    }
}
