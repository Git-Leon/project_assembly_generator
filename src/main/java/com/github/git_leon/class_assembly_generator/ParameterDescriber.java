package com.github.git_leon.class_assembly_generator;

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
        int parameterCount = parameters.length;
        Parameter firstParameter;
        for (int i = 0; i < parameterCount; i++) {
            firstParameter = parameters[0];
            Parameter parameter = parameters[i];
            if (parameter != firstParameter) {
                description += ", ";
            }
            description += "`" + parameter.getType().getCanonicalName() + "`";
        }
        return description;
    }
}
