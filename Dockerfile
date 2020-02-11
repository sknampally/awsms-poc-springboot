FROM maven:3.5.2-jdk-8-alpine AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:8-jdk-slim
ENV PORT 5030
EXPOSE 5030
CMD echo "networkaddress.cache.ttl=0" >> /usr/lib/jvm/java-1.8.0-openjdk-amd64/jre/lib/security/java.security
COPY target/awsms-poc-api-0.0.1-SNAPSHOT.jar /opt/
WORKDIR /opt
CMD ["java","-jar","awsms-poc-api-0.0.1-SNAPSHOT.jar"]
