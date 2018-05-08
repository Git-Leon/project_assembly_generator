package com.github.git_leon.class_assembly_generator;

/**
 * @author leon on 4/27/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        String topLevelPackageName = args[0];
        ProjectDescriber projectDescriber = new ProjectDescriber(topLevelPackageName);
        String projectDescription = projectDescriber.toString();

        String outputFilePath = "target/how_to_create_this_project.txt";
        FileWriter fileWriter = new FileWriter(outputFilePath);
        fileWriter.write(projectDescription);
    }
}
