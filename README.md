

# Define class MainApplication
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `MainApplication`.
* Define static method named `main`, which has a return type of type `void` and a parameter of type `java.lang.String[]`

# Define class ModifierSpy
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ModifierSpy`.
* Define non-static method named `isAbstract`, which has a return type of type `boolean` and nullary parameters
* Define non-static method named `getStaticism`, which has a return type of type `String` and nullary parameters
* Define non-static method named `getFinalism`, which has a return type of type `String` and nullary parameters
* Define non-static method named `getAbstractness`, which has a return type of type `String` and nullary parameters
* Define non-static method named `getAccessibility`, which has a return type of type `String` and nullary parameters
* Define non-static method named `validateModifier`, which has a return type of type `String` and a parameter of type `java.lang.String[]`
* Declare non-static field named `modifiers` of type `Class`. The field has `private` accessibility.

# Define class FieldDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `FieldDescriber`.
* Define non-static method named `toString`, which has a return type of type `String` and nullary parameters
* Declare non-static field named `field` of type `Class`. The field has `private` accessibility.

# Define class ClassSignatureDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ClassSignatureDescriber`.
* Define non-static method named `toString`, which has a return type of type `String` and nullary parameters
* Define non-static method named `getPrototype`, which has a return type of type `String` and nullary parameters
* Declare non-static field named `cls` of type `ParameterizedTypeImpl`. The field has `private` accessibility.
* Declare non-static field named `modifiers` of type `Class`. The field has `private` accessibility.

# Define class ParameterDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ParameterDescriber`.
* Define non-static method named `toString`, which has a return type of type `String` and nullary parameters
* Declare non-static field named `parameters` of type `Class`. The field has `private` accessibility.
* Declare non-static field named `prefix` of type `Class`. The field has `private` accessibility.

# Define class MethodDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `MethodDescriber`.
* Define non-static method named `toString`, which has a return type of type `String` and nullary parameters
* Declare non-static field named `method` of type `Class`. The field has `private` accessibility.
* Declare non-static field named `modifierSpy` of type `Class`. The field has `private` accessibility.
* Declare non-static field named `prefix` of type `Class`. The field has `private` accessibility.

# Define class ClassDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ClassDescriber`.
* Define static method named `getFullDescription`, which has a return type of type `String` and a parameter of type `java.lang.Class`
* Define static method named `getParameterDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Parameter[]`
* Define static method named `getClassSignatureDescription`, which has a return type of type `String` and a parameter of type `java.lang.Class`
* Define static method named `getFieldDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Field`
* Define static method named `getMethodDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Method`

# Define class ProjectDescriber
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ProjectDescriber`.
* Define non-static method named `toString`, which has a return type of type `String` and nullary parameters
* Define non-static method named `getClasses`, which has a return type of type `Set` and nullary parameters
* Declare non-static field named `reflections` of type `Class`. The field has `default` accessibility.

# Define class FileWriter
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `FileWriter`.
* Define non-static method named `write`, which has a return type of type `void` and a parameter of type `java.lang.Object`
* Declare non-static field named `out` of type `Class`. The field has `private` accessibility.

# Define class ReadMeGenerator
* Define concrete class in the `com.github.git_leon.class_assembly_generator` package named `ReadMeGenerator`.
* Define non-static method named `getFullDescription`, which has a return type of type `String` and a parameter of type `java.lang.Class`
* Define non-static method named `getParameterDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Parameter[]`
* Define non-static method named `getClassSignatureDescription`, which has a return type of type `String` and a parameter of type `java.lang.Class`
* Define non-static method named `getFieldDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Field`
* Define non-static method named `getMethodDescription`, which has a return type of type `String` and a parameter of type `java.lang.reflect.Method`
* Define non-static method named `writeToReadMe`, which has a return type of type `void` and nullary parameters
* Declare non-static field named `projectDescriber` of type `Class`. The field has `private` accessibility.