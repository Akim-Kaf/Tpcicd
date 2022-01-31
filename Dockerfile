FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.1.13-slim

COPY target/SimpleAstronomyLib-?????.jar /opt/simple-astronomy/simple-astronomy.jar

# on expose le port 8080
EXPOSE 8080
# On expose le port 8081
EXPOSE 8081

ENV JAVA_TOOL_OPTIONS="-XX:+IgnoreUnrecognizedVMOptions -XX:+UseContainerSupport -XX:+IdleTuningCompactOnIdle -XX:+IdleTuningGcOnIdle"

# Execution du jar
ENTRYPOINT java \
    -Djava.security.egd=file:/dev/./urandom \
    -jar /opt/simple-astronomy/simple-astronomy.jar \
    --spring.profiles.active=kubernetes