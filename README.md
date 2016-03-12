#Spring Boot Groovy Minimal Configuration

This is minimal spring boot configuration based on Groovy and Gradle. This project was created as template for later 
development. 

This project includes below configuration:

 * JDK8
 * Groovy 2.3.11
 * Gradle
 * Spring Boot 1.3.3.RELEASE
 * few Groovy class for verification purpose.
 * Apache Tomcat 8+  
 * Lombok - https://projectlombok.org/ 

----

### Building/Running project

This project works with embeded tomcat or as deployable WAR.

To run with embedded tomcat just run:

    gradle bootRun

To build as deployable WAR (tested on Tomcat 9) run:

    gradle war 


  
  


