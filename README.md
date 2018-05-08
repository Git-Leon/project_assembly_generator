# Project Assembly Generator
* This project generates step-by-step descriptions of how to stub out each method of each class in a given project.

## Usage

### Step 1 - Add Maven Repository to `pom.xml`
* Because this dependency is hosted on a private server, not MavenCentral, the `pom.xml` must be configured to search in the proper repository.

```xml
<repositories>
  <repository>
    <id>git-leon-utils</id>
    <url>https://packagecloud.io/git-leon/utils/maven2</url>
    <releases>
      <enabled>true</enabled>
    </releases>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```

### Step 2 - Add Maven Dependency to `pom.xml`
* To use this project, add the dependency to your `pom.xml`

```xml
<dependency>
  <groupId>com.github.git-leon</groupId>
  <artifactId>project-assembly-generator</artifactId>
  <version>1.1</version>
</dependency>
```


### Step 3 - Instantiate a `ReadMeGenerator`
* Instantiate a `ReadMeGenerator` which takes an argument of a `String` representative of the top level package-name.
* Invoke the `writeToReadMe()` method on the instance.
* Open the newly generated `README.md` from the top level directory of the project.

```java
public static void main(String[] args) {
    new ReadMeGenerator("com.github").writeToReadMe();
}
```


## Sample
* Given a sample project whose structure is as follows:<br>
<img src = "./assets/project structure.png">

* Using the 3 step process above will generate a `README.md` with content like:
<img src = "./assets/sample README generation.png">
