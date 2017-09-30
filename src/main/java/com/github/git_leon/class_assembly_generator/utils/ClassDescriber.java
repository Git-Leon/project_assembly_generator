package com.github.git_leon.class_assembly_generator.utils;

/**
 * Created by leon on 9/29/17.
 */
public class ClassDescriber {
    private final Class<?> cls;
    private final ModifierSpy modifiers;
    private String description;

    public ClassDescriber(Class<?> cls) {
        this.cls = cls;
        this.modifiers = new ModifierSpy(cls);
    }

    public String toString() {
        String description = "%s class in the `%s` package named `%s.`";
        return String.format(description,
                modifiers.getAbstractness(),
                cls.getPackage().getName(),
                cls.getCanonicalName());
    }


}
