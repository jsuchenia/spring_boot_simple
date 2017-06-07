FROM openjdk:8-jre-alpine
VOLUME /tmp
ADD target/pptest-0.0.1-SNAPSHOT.jar /pptest.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/pptest.jar"]
