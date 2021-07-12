# Java hibernate-spring

## Table of Contents
* [General info](#general-info) 
* [Technologies](#technologies) 
* [Setup](#setup)
* [Extra information](#Extra)

------------
## General info



------------
## Technologies

>- Java development kit 8
>- Maven 3.8.1
>- Apache Tomcat 9
>- OmniDB
>- Spring tools 4
>- Docker Desktop
>- eclipse neon 3

## Dependencies:

>- Lombok
>- swagger2
>- swagger ui
>- Spring boot starter security
>- Spring boot starter data JPA
>- Postgresql
>- Spring boot starter test
>- Spring boot starter web

## Plugins:
>- Spring boot maven plugin
>- Docker maven plugin

------------
## Setup
This project was made on a Windows 10 OS.

### Java development kit 8
- Go to https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html and download on your system operative
- execute the file .jar and continue the steps with the installer

### Maven 3.8.1
- Go to https://maven.apache.org/download.cgi
- click on Binary Zip archive and download
- Extract on your preference folder

###  Tomcat 9
- Go to https://tomcat.apache.org/download-90.cgi
- pick on the left side tomcat 9
- on core select ZIP and download
- Extract on your preference folder

###  OmniDB
- Go to https://omnidb.org/ and click download
- follow the steps with the installer

###  Spring tools 4
- Go to https://spring.io/tools and click download on your operative system
- move it into your preference folder and run the file .jar

###  Docker Desktop
- Go to https://www.docker.com/products/docker-desktop and click download on windows
- Also download toolbox https://github.com/docker/toolbox/releases from this github
- shut down your pc and initialize BIOS and star the virtualization

### Eclipse Neon 3
- Go to https://www.eclipse.org/downloads/packages/release/neon/3 and download Eclipse IDE for Java EE developers
- continue the installation with the installer

*Dependencies and plugins install in pom.xml*

### Lombok
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
		</dependency>`


### Swagger 2
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
    		<groupId>io.springfox</groupId>
    		<artifactId>springfox-swagger2</artifactId>
    		<version>2.9.2</version>
		</dependency>`

    
### Swagger ui
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
    		<groupId>io.springfox</groupId>
    		<artifactId>springfox-swagger-ui</artifactId>
    		<version>2.9.2</version>
		</dependency>`

### Spring boot starter security
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
    		<groupId>org.springframework.boot</groupId>
    		<artifactId>spring-boot-starter-security</artifactId>
		</dependency>`
    
### PostgreSQL
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
    		<groupId>org.postgresql</groupId>
    		<artifactId>postgresql</artifactId>
		</dependency>`    
    
### Spring boot starter test
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>` 

### Spring boot starter web
- Copy the next code and insert it into the file in the dependencies part of the code.
-  `<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>` 

    
### Spring boot maven plugin
- Copy the next code and insert it into the file in the plugins part of the code.
-  `  <plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>`    
      
### Docker maven plugin
- Copy the next code and insert it into the file in the plugins part of the code.
-  `  <plugin>
				<groupId>io.fabric8</groupId>
				<artifactId>docker-maven-plugin</artifactId>
				<version>0.21.0</version>
			</plugin>`       
------------
## Extra

>- Business app and the layers of them
>- Components of web apps
>- URL and how is it structured
>- advantage of web apps
>- web server
>- MVC pattern (modelo vista controlador / Model view Controller)
>- what is servlets and their use
>- Java server pages (JSP)
>- Spring and his characteristics
>- Spring boot and his characteristics
>- object persistance 
>- Spring data JPA as ORMs (object relational mapping)
>- Transactional issue in a business operation
>- SpringRest (Api operations)
>- Spring security in web apps
>- Docker 

------------
### commands that i learned
|  Command | Function  |
| ------------ | ------------ |
| @Springbootapplication | Tells Spring Boot that a class manages the app   |
| @Entitiy | Use in java class that it is representing a table in the database   |
| @table  | Receives the name of the table to which our class is mapping   |
| @column  | Used when the name of our column is different from the name of the attribute of our table   |
| @id  | Represents the primary key of the table |
| @GenerateValue  | Automatically generate values for the primary keys   |
| @OneToMany @ManyToOne  | Represent existing relationships in tables but represented in classes   |
| @Query    | Used to make native queries   |
| @Repository   | Tells the class that it interacts with the database |
| @Component   | Indicates a class is a spring component  |
| @Service   | Indicates that a class is a business logic service  |
| @RestController   | Tells spring that a class will be a controller of a rest API |
| @RequestMapping | It indicates in which path it will accept the requests that we make |
| @PathVariable | Is to specify the path that you will put in the URL |
| @GetMapping    | To obtain information  |
| @Postmapping  | To save or update information  |
| @Deletemapping | To delete information |
| CrudRepository methods | save(), delete(), update() |
| @ApiOperation | is to add a description on the swagger page to the methods |
| @ApiResponse | is the way he responds |
| @ApiResponses | is to put togetjer some Apiresponse |
| @transactional |   |
| @namedquery |   |
| @GenericGenerator |   |
| @Configuration |   |
| @EnableWebSecurity |   |
| @Data |   |
