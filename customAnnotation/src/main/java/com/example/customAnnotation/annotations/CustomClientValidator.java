package com.example.customAnnotation.annotations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomClientValidator implements ConstraintValidator<ClientValidate, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        try {
            ClientTypeEnum.valueOf(s); // Ensure case-insensitive comparison
            return true;
        } catch (IllegalArgumentException e) {
            return false; // Invalid enum value
        }
    }
}
