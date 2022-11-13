# logback-slf4j-base-project
Basic Maven project with :
- Java 17 
- Logback (and slf4j bridges configured correctly)
- JUnit 5, Mockito and AssertJ
- Plugins configured for PIT, Jacoco, Enforcer, Failsafe and Surefire
- Owasp dependency check (when using maven profile `cve`)


You can use this project as a base for an archetype :

```asciidoc
mvn archetype:create-from-project
cd target/generated-sources/archetype/
mvn install
```

Now go to the directory where you want to start your new project and run the command and follow the instructions :<br/>
(and look for `local -> net.jvw:sample-project-archetype (sample-project-archetype)`)


```asciidoc
mvn archetype:generate -DarchetypeCatalog=local
```


source: https://devcanvas.org/2015/11/17/create-your-own-maven-archetype/

*Remove everything above the following line since you don't need these instructions after your finished* 
-----------
# Your project name here

## Checking for vulnerabilities

To run the Maven build with the _Owasp dependency check_ enabled run :
```asciidoc
mvn -Pcve clean verify
```

This will result in a report in a report in `target/dependency-check-report.html`