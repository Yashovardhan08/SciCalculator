FROM openjdk:19
ADD target/sci-calc.jar sci-calc.jar
ENTRYPOINT ["java", "-jar","sci-calc.jar"]
EXPOSE 8090