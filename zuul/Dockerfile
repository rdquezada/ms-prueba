FROM maven:3.6.3-jdk-8
ADD /target/zuul-0.0.1-SNAPSHOT.jar zuul-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-Dspring.profiles.active=container", "-jar", "zuul-0.0.1-SNAPSHOT.jar"]