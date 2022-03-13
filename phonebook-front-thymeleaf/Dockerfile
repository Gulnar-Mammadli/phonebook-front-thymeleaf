FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} phonebook-front-thymeleaf-1.0.jar

ENTRYPOINT ["java", "-jar", "/phonebook-front-thymeleaf-1.0.jar"]