package com.github.git_leon.class_assembly_generator;

/**
 * @author leon on 4/27/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        new ReadMeGenerator("com.github").writeToReadMe();
    }
}
