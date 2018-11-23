FROM openjdk:8-jdk-alpine
ARG JAR_FILE
RUN echo ${JAR_FILE}
COPY target/${JAR_FILE} app.jar
EXPOSE 8762
CMD ["java", "-jar", "app.jar",  "--eureka.client.serviceUrl.defaultZone=http://eureka-server:8761/eureka"]
# CMD ["java", "-jar", "app.jar"]