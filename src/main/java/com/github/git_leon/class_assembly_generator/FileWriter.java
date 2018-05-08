package com.github.git_leon.class_assembly_generator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * @author leon on 5/8/18.
 */
public class FileWriter {
    private final PrintStream out;

    public FileWriter(String filePath) {
        try {
            this.out = new PrintStream(new FileOutputStream(filePath));
        } catch (FileNotFoundException e) {
            throw new Error(e);
        }
    }

    public void write(Object strValue) {
        out.print(strValue);
    }
}
