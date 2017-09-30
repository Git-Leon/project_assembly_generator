package com.github.git_leon.class_assembly_generator;

import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ClasspathHelper;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Created by leon on 9/29/17.
 */
public class ProjectDescriber {
    Reflections reflections = null;
    public ProjectDescriber() {
        this("com.github.git_leon");
    }

    public ProjectDescriber(String org_your_package) {
        List<ClassLoader> classLoadersList = new LinkedList<ClassLoader>();
        classLoadersList.add(ClasspathHelper.contextClassLoader());
        classLoadersList.add(ClasspathHelper.staticClassLoader());

        this.reflections = new Reflections(new ConfigurationBuilder()
                .setScanners(new SubTypesScanner(false /* don't exclude Object.class */), new ResourcesScanner())
                .setUrls(ClasspathHelper.forClassLoader(classLoadersList.toArray(new ClassLoader[0])))
                .filterInputsBy(new FilterBuilder().include(FilterBuilder.prefix(org_your_package))));
    }

    @Override
    public String toString() {
        Set<Class<?>> classes = reflections.getSubTypesOf(Object.class);
        StringBuilder sb = new StringBuilder();
        for(Class c : classes) {
            sb.append("\n" + ClassDescriber.getFullDescription(c));
        }
        return toString();
    }
}
