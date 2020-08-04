FROM maven:3.6.3-jdk-8
ADD /target/microservicio-0.0.1-SNAPSHOT.jar microservicio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "microservicio-0.0.1-SNAPSHOT.jar"]

