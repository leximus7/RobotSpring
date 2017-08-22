package ru.javabegin.training.spring.common;


import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD,ElementType.PARAMETER})
@Qualifier
public @interface RobotQualifier {
    Color color();
    int year();
}
