package com.github.git_leon.class_assembly_generator;

import org.junit.Test;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.sql.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by leon on 9/29/17.
 */
public class TestDescriber {
    Reflections reflections = null;
    {
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        this.reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix("com.github.git_leon"))));
    }

    @Test
    public void testDescribeFull() {
        Set<Class<?>> classes = reflections.getSubTypesOf(Object.class);
        for(Class c : classes) {
            System.out.println(Describer.getFullDescription(c));
        }
    }
}
