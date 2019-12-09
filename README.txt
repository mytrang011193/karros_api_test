Guide to run test

Setup environment:
- Install Java (I'm using Java 13.0.1)
- Install Maven and add Maven to System variable (I'm using Maven 3.6.3)

Execute test:
- Open Cmd, cd to {your_local_parrent_folder}\karros_api_test\ (folder which file pom.xml stored)
- Run cmd: mvn clean test
Because I fix the test suite xml file in pom.xml, so you don't need to pass the test file here.
