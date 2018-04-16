package com.github.git_leon.class_assembly_generator;

import org.junit.Test;

/**
 * Created by leon on 9/29/17.
 */
public class TestProjectDescriber {
    @Test
    public void testToString() {
        System.out.println(new ProjectDescriber().toString());
    }

    @Test
    public void testToString2() {
        String topLevelPackageName = "com.github";
        System.out.println(new ProjectDescriber(topLevelPackageName).toString());
    }
}
