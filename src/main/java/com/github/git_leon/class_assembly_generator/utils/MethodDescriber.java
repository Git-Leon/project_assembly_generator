package com.github.git_leon.class_assembly_generator.utils;

import java.lang.reflect.Method;

/**
 * Created by leon on 9/29/17.
 */
public class MethodDescriber {
    private final Method method;
    private String description;

    public MethodDescriber(Method method) {
        this.method = method;
        this.description = new Modifiers(method).isAbstract() ? "Declare " : "Define ";
    }

    public String toString() {
        description += "method named `%s`, which has a return type of `%s` and %s";
        return String.format(description,
                method.getName(),
                method.getGenericReturnType().getTypeName(),
                Describer.getParameterDescription(method.getParameters()));
    }
}
