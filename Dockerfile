FROM openjdk:8u265-jdk-buster
ADD target/restdocker-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar restdocker-0.0.1-SNAPSHOT.jar