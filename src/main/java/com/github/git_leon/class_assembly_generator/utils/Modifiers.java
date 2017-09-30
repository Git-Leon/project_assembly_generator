package com.github.git_leon.class_assembly_generator.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Created by leon on 9/29/17.
 */
public class Modifiers {
    private final String modifiers;
    private String staticism;
    private String finalism;

    public Modifiers(int modifiers) {
        this.modifiers = Modifier.toString(modifiers);
    }

    public Modifiers(Class c) {
        this(c.getModifiers());
    }

    public Modifiers(Field f) {
        this(f.getModifiers());
    }

    public Modifiers(Method m) {
        this(m.getModifiers());
    }

    public Modifiers(Parameter p) {
        this(p.getModifiers());
    }

    public boolean isAbstract() {
        return getAbstractness().equalsIgnoreCase("abstract");
    }


    public String getAccessibility() {
        String modifier = modifierPresumption("private", "protected", "public");
        return "".equals(modifier) ? "default" : modifier;
    }

    public String getStaticism() {
        return modifierPresumption("static");
    }

    public String getAbstractness() {
        String modifier = modifierPresumption("abstract");
        return "".equals(modifier) ? "concrete" : modifier;

    }

    private String modifierPresumption(String... strings) {
        for (String s : strings) {
            if (modifiers.contains(s))
                return s;
        }
        return "";
    }

    public String getFinalism() {
        return modifierPresumption("final");
    }
}
