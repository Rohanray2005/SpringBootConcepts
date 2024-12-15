package com.example.customAnnotation.annotations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER})
@Documented
@Constraint(validatedBy = CustomClientValidator.class)
public @interface ClientValidate {
    String message() default "Invalid client";

    // Grouping constraints (optional)
    Class<?>[] groups() default {};

    // Payload for additional metadata (optional)
    Class<? extends Payload>[] payload() default {};
}
