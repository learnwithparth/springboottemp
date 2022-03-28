FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 443
ADD target/Temp-0.0.1-SNAPSHOT.jar springboot.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]