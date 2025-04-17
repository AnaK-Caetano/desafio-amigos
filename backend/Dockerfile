FROM maven:3.9.6-eclipse-temurin-17

# RUN apt-get update && apt-get install -qq -y --no-install-recommends

WORKDIR /desafio-amigos-api

COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src

CMD ["mvn", "spring-boot:run", "-Dspring-boot.run.jvmArguments='-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005'"]
