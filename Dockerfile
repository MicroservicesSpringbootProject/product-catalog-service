FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} product-catalog-service.jar
ENTRYPOINT ["java", "-jar", "/product-catalog-service.jar"]
EXPOSE 9002