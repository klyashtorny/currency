FROM openjdk:18-alpine
COPY target/*.jar gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]