package com.github.git_leon.class_assembly_generator;

/**
 * Created by leon on 9/29/17.
 */
public class ClassSignatureDescriber {
    private final Class<?> cls;
    private final ModifierSpy modifiers;

    public ClassSignatureDescriber(Class<?> cls) {
        this.cls = cls;
        this.modifiers = new ModifierSpy(cls);
    }

    public String toString() {
        String description = "Define %s %s in the `%s` package named `%s.`";
        return String.format(description,
                modifiers.getAbstractness(),
                getPrototype(),
                cls.getPackage().getName(),
                cls.getCanonicalName());
    }

    public String getPrototype() {
        if(cls.isInterface()) {
            return "interface";
        } else if (cls.isEnum()) {
            return "enum";
        } else {
            return "class";
        }
    }
}
