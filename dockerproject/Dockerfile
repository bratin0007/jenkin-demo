FROM openjdk:latest
MAINTAINER Bratin
RUN mkdir /dockerservice
ADD target/dockerproject-0.0.1-SNAPSHOT.jar /dockerservice
EXPOSE 8062:8062
CMD ["java","-jar","/dockerservice/dockerproject-0.0.1-SNAPSHOT.jar "]