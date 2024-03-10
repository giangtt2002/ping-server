FROM amazoncorretto:17-alpine-jdk

COPY target/docker-ping-server-1.0.0.jar ping-server-1.0.0.jar

ENTRYPOINT ["java","-jar","/ping-server-1.0.0.jar"]