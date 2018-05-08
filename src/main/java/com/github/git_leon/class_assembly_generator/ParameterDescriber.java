package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Parameter;

/**
 * Created by leon on 9/29/17.
 */
public class ParameterDescriber {
    private final Parameter[] parameters;
    private final String prefix;

    public ParameterDescriber(Parameter[] parameters) {
        this.parameters = parameters;
        switch (parameters.length) { // get prefix prefix
            case 0:
                this.prefix = "nullary parameters";
                break;

            case 1:
                this.prefix = "a parameter of type ";
                break;

            default:
                this.prefix = "parameters of type ";
                break;
        }
    }

    @Override
    public String toString() {
        String description = prefix;
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
