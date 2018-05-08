package com.github.git_leon.class_assembly_generator;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Created by leon on 9/29/17.
 */
public class TestProjectDescriber {
    @Before
    public void setup() {
        PrintStream out = null;
        try {
            out = new PrintStream(new FileOutputStream("target/how_to_create_this_project.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.setOut(out);
    }

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
