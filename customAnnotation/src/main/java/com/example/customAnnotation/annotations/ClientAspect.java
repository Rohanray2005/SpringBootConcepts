package com.example.customAnnotation.annotations;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ClientAspect {
    private static final ThreadLocal<ClientTypeEnum> clientContext = new ThreadLocal<>();

    @Before("@within(clientType) || @annotation(clientType)") // Match @ClientType on class or method
    public void captureClientType(JoinPoint joinPoint, ClientType clientType) {
        if (clientType != null) {
            clientContext.set(clientType.value());
        }
    }

    public static ClientTypeEnum getCurrentClientType() {
        return clientContext.get();
    }
}
