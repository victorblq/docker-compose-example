FROM maven:3.8.1-openjdk-11 as build

WORKDIR /build

COPY common common
COPY business business
COPY partner-integrator partner-integrator

COPY pom.xml .

RUN mvn clean package

FROM openjdk:11
ARG app

COPY --from=build /build/$app/target/*jar /app.jar

ENTRYPOINT java -jar /app.jar