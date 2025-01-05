FROM maven:3.8.7-openjdk-18-slim as builder

WORKDIR /app

COPY pom.xml ./
COPY src/ ./src/

RUN mvn package

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=builder /app/target/dockertest-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "/app/target/dockertest-0.0.1-SNAPSHOT.jar"]