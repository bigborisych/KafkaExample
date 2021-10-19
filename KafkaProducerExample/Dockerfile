FROM openjdk:15 as build
ARG JAR_FILE=target/KafkaProducerExample-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]