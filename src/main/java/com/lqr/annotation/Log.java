package com.lqr.annotation;

import java.lang.annotation.*;

/**
 * @创建者 CSDN_LQR
 * @描述 自定义注解
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
@Documented
public @interface Log {
    String logStr() default "";
}
