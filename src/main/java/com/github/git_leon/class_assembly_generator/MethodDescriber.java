package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Method;

/**
 * Created by leon on 9/29/17.
 */
public class MethodDescriber {
    private final Method method;
    private final ModifierSpy modifierSpy;
    private String description;

    public MethodDescriber(Method method) {
        this.method = method;
        this.modifierSpy = new ModifierSpy(method);
        this.description = modifierSpy.isAbstract() ? "Declare " : "Define ";
    }

    public String toString() {
        description += "%s method named `%s`, which has a return type of type `%s` and %s";
        return String.format(description,
                modifierSpy.getStaticism(),
                method.getName(),
                method.getReturnType().getSimpleName(),
                ClassDescriber.getParameterDescription(method.getParameters()));
    }
}
