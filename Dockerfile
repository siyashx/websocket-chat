FROM openjdk:17-jdk
EXPOSE 8080
ADD target/websocket-0.0.1-SNAPSHOT.jar websocket.jar
HEALTHCHECK --interval=30s --timeout=10s --retries=3 \
  CMD curl --fail http://localhost:8080/ || exit 1
ENTRYPOINT ["java", "-jar", "websocket.jar"]

