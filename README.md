# Spring-boot-sample-app

Java, Core Spring and Spring MVC

Spring Data, JPA and Spring JDBC

Front END Application Technologies like Angular and React

Gitbub-Code:
https://github.com/spring-projects/spring-boot
--------------------------------------------------------

Dependency Management

Libraries creation and also the framework

BOM- Bill of Materials in the pom.xml file

Spring-core 4.2.3 works well with the logback-core  1.1.

---------------------------------------------------------
Web initializer setup

http://start.spring.io //Can check the boxes and generate the app

Command line level building:

Use the Spring boot CLI
Commands:
spring.bat --version
spring.bat init --dependencies=web myNewApp
-----------------------------------------------------------------
ShortCuts
Ctrl>shift>O -- for the quick fix
F3 for the class seeing
----------------------------------------------------------------
Annotations

@SpringBootApplication--Spring boot application setup convenient
@Configuration--Spring Configuration on Start UP
@EnableAutoConfiguration--Auto Configures Framework
@ComponentScan--Scans project for Spring Components

SpringApplication.run(App.class, args);--This creates spring context, applies annotations and sets up the container

Controller class
@RestController
@RequestMapping("/")

-----------------------------------------------------------
Features
	1) Main Method entry point in java
	2) Spring application consist of the Spring Context, Spring Environment and the Initializers
	3) Embeded Server is also available Default is Tomcat Auto Configured 
 4) Containerless Deployment
 
 --------------------------------------------------------
 Container Deployments

	1) Pre-Setup and Configuration
	2) Need to provide the deployment Descriptors web.xml to tell containers how to work
	3) Environment configuration is external  to your application

Application Deployments
	1) Runs anywhere Java is setup(think cloud deployments)
Container is embedded and the app directs how the container works, no deployment descriptor is required
---------------------------------------------------------

Git hub UI code
https://github.com/dlbunker/ps-spring-boot-resources

Dlbunker code repo
https://github.com/dlbunker/ps-spring-boot-resources
Default static content locations :
	- Classpath
	- /static
	- /public
 - /resources
 ---------------------------------------------------------
 Spring MVC Rest Controller

ngResource for "shipwreck"

	- GET /api/v1/shipwrecks(list)
	- POST /api/v1/shipwrecks (add)
	- GET  /api/v1/shipwrecks/{id} (view)
	- PUT /api/v1/shipwrecks/{id}(update)
 - DELETE /api/v1/shipwrecks/{id}(delete)
 
 -----------------------------------------------------------
 Spring MVC Integration Overview

	- spring-boot-starter-web in the pom.xml
	- Set up the view resolvers
	- Sets up the static resource serving
	- Sets up the HTTPMessageConverter
	- Sets up the customizable hooks-- framework intergrations

------------------------------------------------------------
application.properties
	- Place on the classpath root  in the resources folder
	- Can be in the YAML format or the Properties format-Snake YAML dependencies

Environmental Configuration
 
	-  application-{profile}.properties, eg application-dev.properties/ consist of only the environment specific details


Steps to be followed

	- Create the application.properties
	- Customize embedded container
 - Setup environment properties

VM arguments for the profile management
-Dspring.profiles.active=test

JPA and the data dependency management

- Data base configuration to different sets of other configurations
- Data Source pooling - connection pools and autoconfiguration automatically adds the pool connection required.
- tomcat-jdbc is the default pooling strategy

Steps
Flyway DB configuration to be done for the application setup
Configure flyway data source
create the migration scripts
migrate on the app startup

Java Configuration setups,
- Define the spring beans usining java
 @Configuration, @bean, @ConfigurationProperties annotation to be used
- Will be added to the spring-context

----------------------------------------------------------------------------------------

Spring Testing

Health of the application is improved and some of the testing jars that is required is as follows
Always start with the spring-boot-starter-test
- Junit for all the java unit testing(http://junit.org)
- Hamcrest for the matching and assertions(http://hamcrest.org)
- Mockito for the mock objects and verify
- Spring test for the testing tools and integration testing support

Steps to do,
1) Add the spring-boot-starter-test dependency
2) Construct a test
3) Running Tests

Hamcrest provides the features declarative, matching and matching rules

----------------------------------------------------------------------------------------

Integration Testing

Spring app
- Containers are difficult to test
- Spring Context needs to be available
- App/Test start up is slow
- Database state needs to be consistent

Spring-boot

- Auto Configuration Settings
- No Container
- App/Test start up is slow
- Database state needs to be consistent

Annotations
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration

Web Integration Test 
@WebIntegrationTest


