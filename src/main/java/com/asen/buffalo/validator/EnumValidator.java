package com.asen.buffalo.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * @author Asen
 * @description 枚举类校验器
 * @date 2019/09/19
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DefaultEnumValidator.class)
@Documented
public @interface EnumValidator {

    Class<? extends Enum<? extends Verifiable>> value();

    String message() default "invalid enum value";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
