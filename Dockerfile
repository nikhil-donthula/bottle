FROM openjdk:17-jdk-alpine

EXPOSE 8080

WORKDIR /app

COPY /build/libs/bottle-0.0.1-SNAPSHOT.jar /app/bottle-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "./bottle-0.0.1-SNAPSHOT.jar"]