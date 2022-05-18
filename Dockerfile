FROM java:8

EXPOSE 8080

ADD target/docker-sell.jar docker-sell.jar

ENTRYPOINT ["java","-jar","docker-sell.jar"]