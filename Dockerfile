FROM openjdk:8
VOLUME /tmp
ADD target/oauth2-resource-server-0.1.jar /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]