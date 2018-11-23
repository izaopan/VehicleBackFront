FROM openjdk:8-jdk-alpine
ARG JAR_FILE
RUN echo ${JAR_FILE}
COPY target/${JAR_FILE} app.jar
EXPOSE 8761
CMD ["java", "-jar", "app.jar"]
# CMD ["java", "-jar", "monitor-0.0.1-SNAPSHOT.jar"]