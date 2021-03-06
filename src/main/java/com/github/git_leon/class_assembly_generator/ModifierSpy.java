package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

/**
 * Created by leon on 9/29/17.
 */
public class ModifierSpy {
    private final String modifiers;

    public ModifierSpy(int modifiers) {
        this.modifiers = Modifier.toString(modifiers);
    }

    public ModifierSpy(Class c) {
        this(c.getModifiers());
    }

    public ModifierSpy(Field f) {
        this(f.getModifiers());
    }

    public ModifierSpy(Method m) {
        this(m.getModifiers());
    }

    public ModifierSpy(Parameter p) {
        this(p.getModifiers());
    }

    public boolean isAbstract() {
        return getAbstractness().equalsIgnoreCase("abstract");
    }

    public String getStaticism() {
        String modifier = validateModifier("static");
        return modifier.equals("static") ? "static" : "non-static";
    }

    public String getFinalism() {
        return validateModifier("final");
    }

    public String getAbstractness() {
        String modifier = validateModifier("abstract");
        return "".equals(modifier) ? "concrete" : modifier;
    }

    public String getAccessibility() {
        String modifier = validateModifier("private", "protected", "public");
        return "".equals(modifier) ? "default" : modifier;
    }

    private String validateModifier(String... strings) {
        for (String s : strings) {
            if (modifiers.contains(s))
                return s;
        }
        return "";
    }
}