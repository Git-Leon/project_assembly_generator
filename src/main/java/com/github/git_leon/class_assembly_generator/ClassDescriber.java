package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.sql.Date;

/**
 * Created by leon on 9/29/17.
 */
public class ClassDescriber {
    public static String getFullDescription(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + ClassDescriber.getClassSignatureDescription(cls));

        for (Method m : cls.getDeclaredMethods()) {
            sb.append("\n" + ClassDescriber.getMethodDescription(m));
        }

        for (Field field : cls.getDeclaredFields()) {
            sb.append("\n" + ClassDescriber.getFieldDescription(field));
        }

        return sb.toString();
    }

    public static String getMethodDescription(Method m) {
        return new MethodDescriber(m).toString();
    }

    public static String getParameterDescription(Parameter... parameters) {
        return new ParameterDescriber(parameters).toString();
    }

    public static String getClassSignatureDescription(Class<?> cls) {
        return new ClassSignatureDescriber(cls).toString();
    }

    public static String getFieldDescription(Field f) {
        return new FieldDescriber(f).toString();
    }
}