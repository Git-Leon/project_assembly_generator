package com.github.git_leon.class_assembly_generator;

import java.lang.reflect.Field;

/**
 * Created by leon on 9/29/17.
 */
public class FieldDescriber {
    private final Field field;

    public FieldDescriber(Field field) {
        this.field = field;
    }
    public String toString() {
        ModifierSpy modifiers = new ModifierSpy(field);
        String description = "Declare %s %s field named `%s` of type `%s`. The field has `%s` accessibility.";
        return String.format(description,
                modifiers.getStaticism(),
                modifiers.getAbstractness(),
                field.getName(),
                field.getType().getCanonicalName(),
                modifiers.getAccessibility());
    }
}
