package com.github.git_leon.class_assembly_generator.utils;

import java.lang.reflect.Parameter;

/**
 * Created by leon on 9/29/17.
 */
public class ParameterDescriber {
    private final Parameter[] parameters;
    private String description;

    public ParameterDescriber(Parameter[] parameters) {
        this.parameters = parameters;
        this.description = null;
        switch (parameters.length) { // get description prefix
            case 0:
                description = "nullary parameters";
                break;

            case 1:
                description = "a parameter of type ";
                break;

            default:
                description = "parameters of type ";
                break;
        }
    }

    @Override
    public String toString() {
        String description = null;
        int parameterCount = parameters.length;
        for (int i = 0; i < parameterCount; i++) {
            Parameter parameter = parameters[i];
            if (i + 1 < parameterCount) {
                description += ", ";
            }
            description += "`" + parameter.getType().getCanonicalName() + "`";
        }
        return description;
    }
}
