package com.example.customvalidationannotation.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PhoneValidator implements ConstraintValidator<ValidatePhoneNumber,String> {
    @Override
    public boolean isValid(String phone, ConstraintValidatorContext constraintValidatorContext) {

        return phone != null && phone.matches("[0-9]+") && (phone.length() == 10) ;
    }
}
