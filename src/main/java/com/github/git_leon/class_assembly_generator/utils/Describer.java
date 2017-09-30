package com.github.git_leon.class_assembly_generator.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.sql.Date;

/**
 * Created by leon on 9/29/17.
 */
public class Describer {
    public static String getFullDescription(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + Describer.getClassDescription(Date.class));

        for (Method m : Date.class.getDeclaredMethods()) {
            sb.append("\n" + Describer.getMethodDescription(m));
        }

        for (Field field : Date.class.getDeclaredFields()) {
            sb.append("\n" + Describer.getFieldDescription(field));
        }
        return sb.toString();
    }

    public static String getMethodDescription(Method m) {
        return new MethodDescriber(m).toString();
    }

    public static String getParameterDescription(Parameter[] parameters) {
        return new ParameterDescriber(parameters).toString();
    }

    public static String getClassDescription(Class<?> cls) {
        return new ClassDescriber(cls).toString();
    }

    public static String getFieldDescription(Field f) {
        return new FieldDescriber(f).toString();
    }
}