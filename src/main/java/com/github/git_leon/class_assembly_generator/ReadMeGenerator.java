package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author leon on 5/8/18.
 */
public class ReadMeGenerator {
    private final ProjectDescriber projectDescriber;

    public ReadMeGenerator(String org_your_package) {
        this.projectDescriber = new ProjectDescriber(org_your_package);
    }

    private String getFullDescription(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n" + getClassSignatureDescription(cls));

        for (Method m : cls.getDeclaredMethods()) {
            sb.append("\n" + getMethodDescription(m));
        }

        for (Field field : cls.getDeclaredFields()) {
            sb.append("\n" + getFieldDescription(field));
        }

        return sb.toString();
    }

    private String getMethodDescription(Method m) {
        return "* " + new MethodDescriber(m).toString();
    }

    private String getParameterDescription(Parameter... parameters) {
        return new ParameterDescriber(parameters).toString();
    }

    private String getClassSignatureDescription(Class<?> cls) {
        String classSignatureDescription = new ClassSignatureDescriber(cls).toString();
        String prototype = new ClassSignatureDescriber(cls).getPrototype();
        String header = "\n# Define %s %s";
        String formattedHeader = String.format(header, prototype, cls.getSimpleName());
        return formattedHeader + "\n* " + classSignatureDescription;
    }

    private String getFieldDescription(Field f) {
        return "* " + new FieldDescriber(f).toString();
    }

    public void writeToReadMe() {
        FileWriter writer = new FileWriter("README (Generated).md");
        for (Class cls : projectDescriber.getClasses()) {
            writer.write(getFullDescription(cls));
        }
    }
}
