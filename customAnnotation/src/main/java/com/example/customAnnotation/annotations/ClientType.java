package com.example.customAnnotation.annotations;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ClientType {
    ClientTypeEnum value();
}
