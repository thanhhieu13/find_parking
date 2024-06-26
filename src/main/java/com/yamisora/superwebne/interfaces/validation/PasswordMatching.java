package com.yamisora.superwebne.interfaces.validation;

import java.lang.annotation.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import com.yamisora.superwebne.validation.PasswordMatchingValidation;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PasswordMatchingValidation.class)
public @interface PasswordMatching {
    String message() default "Password not matching";
    Class<?>[] groups() default {};
    Class <? extends Payload>[] payload() default {};
    String password();
    String confirmPassword();
}
