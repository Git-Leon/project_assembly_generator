package com.github.git_leon.class_assembly_generator;

/**
 * @author leon on 4/27/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        String topLevelPackageName = args[0];
        System.out.println(new ProjectDescriber(topLevelPackageName).toString());
    }

    public static void demo() {
        String topLevelPackageName = "com.github";
        System.out.println(new ProjectDescriber(topLevelPackageName).toString());
    }
}
