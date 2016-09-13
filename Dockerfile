FROM fabric8/s2i-java:latest 
MAINTAINER Andre J. "andre.jankovsky@scotiabank.com" 
EXPOSE 8080 
COPY /target/MicroService-02-v1.jar /app/ws02app.jar 
WORKDIR /app 
ENTRYPOINT ["java", "-jar", "ws02app.jar"] 
CMD ["start"] 
 
