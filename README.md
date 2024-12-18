# Backend API

## Dependencies

* Java 21
* Maven
* Docker

## How to run it locally

```bash
// How to package the JAR
mvn clean package
java -jar target/backend-0.0.1-SNAPSHOT.jar

// How to run it with docker
mvn spring-boot:build-image -Dspring-boot.build-image.imageName=<image_name>
docker run -p 8080:8080 <image_name>
```