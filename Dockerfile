FROM openjdk:17-jdk-alpine

EXPOSE 8080

WORKDIR /app

ARG JAR_FILE=/build/libs/bottle-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} /app/app.jar

ENTRYPOINT ["java", "-jar", "./app.jar"]