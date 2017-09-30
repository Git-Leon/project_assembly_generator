package com.github.git_leon.class_assembly_generator;

import org.junit.Test;

import java.sql.Date;

/**
 * Created by leon on 9/29/17.
 */
public class TestDescriber {
    @Test
    public void testDescribeFull() {
        System.out.println(Describer.getFullDescription(Date.class));
    }
}
