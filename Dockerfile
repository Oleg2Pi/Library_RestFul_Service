#FROM gradle:7.6.0-jdk17 AS build
#
#WORKDIR /app
#
#COPY build.gradle .
#COPY settings.gradle .
#COPY src ./src
#
#RUN gradle build

FROM openjdk:17-alpine

WORKDIR /app

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]