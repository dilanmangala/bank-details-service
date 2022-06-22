FROM openjdk:8
EXPOSE 8080
ADD target/Account-0.0.1-SNAPSHOT.jar Account-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Account-0.0.1-SNAPSHOT.jar"]
