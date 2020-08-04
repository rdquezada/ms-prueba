FROM maven:3.6.3-jdk-8
ADD /target/eureka-0.0.1-SNAPSHOT.jar eureka-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "eureka-0.0.1-SNAPSHOT.jar"]
