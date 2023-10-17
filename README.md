# SpringREST
API Rest using Spring Boot

This project was done using: Java 17, maven, VS Code and the Rest Client API Dog

The project exemplifies the creation of a rest api using Spring Boot, where it carries out a web process for creating tasks.

it is possible to create users with login and password

create new accessible tasks 

consult these tasks 

and edit tasks

only through the login of the creating user.

### HOW TO USE

You must paste the link and insert it into your API manager `https://todolist-spring-rest.onrender.com`.

<img src="img\api1.png" width="400">

enter /user for user registration or /task for task management

<img src="img\api2.png" width="400"> <img src="img\api3.png" width="400">

the entire writing pattern can be found within the code

here's an example 

### User registration

{
    "name": "user test",
    "username": "test",
    "password": "1234"
}

### Task registration

{
    "description":"HOW TO USE",
    "title":"README.md",
    "priority":"NORMAL",
    "startAt":"2023-10-18T15:00:00",
    "endAt":"2023-10-20T15:59:00"    
}




### SETTINGS

the configuration of the java extensions are 

 vscjava.vscode-java-pack
  - vscjava.vscode-java-debug
  - vscjava.vscode-java-test
  - vscjava.vscode-java-dependency
  - vscjava.vscode-maven
  - redhat.java
  
 vscjava.vscode-spring-initializr

 vmware.vscode-spring-boot

 vscjava.vscode-spring-boot-dashboard

The configuration used in spring initializr was

- MAVEN project 
- JAVA language
- Springboot 3.0.11
- JAR packaging
- Java 17
 
### DEPENDENCIES

- Spring Web
- Spring Boot development tools

By default, spring is using port `localhost:8080`
If you are already using `port 8080`
you can change it in "application.properties", 
which is in the path `src\main\resources\application.properties.`

The H2 Database Engine was used for storage with local memory storage
by default used the username and password `*admin*`
