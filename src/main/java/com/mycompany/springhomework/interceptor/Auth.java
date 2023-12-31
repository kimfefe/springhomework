package com.mycompany.springhomework.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD}) // 이 어노테이션 사용할 수 있는 타겟을 메소드로 지정
public @interface Auth {
	public enum Role {USER, ADMIN};
	public Role value() default Role.USER;
}
