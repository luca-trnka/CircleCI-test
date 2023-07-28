FROM openjdk:8

WORKDIR /app
COPY build/libs/dummy-project-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
CMD ["java", "-jar", "app.jar"]