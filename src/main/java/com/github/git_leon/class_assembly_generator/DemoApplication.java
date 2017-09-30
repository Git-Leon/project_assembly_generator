package com.github.git_leon.class_assembly_generator;

import com.github.git_leon.class_assembly_generator.utils.Describer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Date;

/**
 * Created by leon on 9/29/17.
 */
public class DemoApplication {
    public static void main(String[] args) {
        System.out.println(Describer.getFullDescription(Date.class));
    }
}
