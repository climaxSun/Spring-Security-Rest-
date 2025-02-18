package com.swb.security.demo.validator;

import com.swb.security.demo.validator.validated.MyConstraintValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author swb
 * 时间  2020-03-25 22:46
 * 文件  MyValidatorAnnotation
 */
@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = {MyConstraintValidator.class})//指定执行哪个类
public @interface MyValidatorAnnotation {

    String message() default "你是没有继承牙狼称号的人";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String prefix() default "冴岛";
}
