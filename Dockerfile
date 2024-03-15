FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar cloudinary.jar
ENTRYPOINT ["java","-jar","/cloudinary.jar"]
EXPOSE 8080