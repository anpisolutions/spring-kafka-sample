# Spring boot sample app with Kafka producer and consumer example
Spring boot sample app includes Message listener from kafka topic and a Rest controller to post message to kafka topic.

## Kafka 
  - Follow link to get Kafka details and installation guide :: https://kafka.apache.org/quickstart

## Spring boot
  - resources/application.yml file contains all the configuration detail required by application. Kafka configuration details need to be specified in application.yml
  - Kafka configuration can also be created using configuration classes.
  - resources/application.yml file can be externalized in order to change configuration detail without rebuilding package. It can be placed next to build file or can be externalized using centralized ConfigServer https://spring.io/guides/gs/centralized-configuration/. Externalizing config file using Centralized configuration server is highly recommended in order to keep track who made the configuration changes and when. 
  
  - Run spring application from command line 
  ```sh
   $ mvn clean spring-boot:run
   ```
  - Create build 
  ```sh
   $ mvn clean -DskipTests=true package
   ```
   - Run Jar file
   ```sh
   $ java -jar <buildfile>
   ```
# Post message to kafka topic
 - Controller has been added with sample project to post messages to kafka topics.
 -  curl -X POST -d 'Hi Satyendra' http://localhost:8080/post-message/test-topic
 


# Recommended applications with spring boot projects
 - Spring boot admin - https://github.com/codecentric/spring-boot-admin
 - Centralized Configuration server : https://spring.io/guides/gs/centralized-configuration


