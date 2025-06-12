FROM eclipse-temurin:17
COPY target/deployjenkins.jar mydeployjenkins.jar
CMD ["java", "-jar", "mydeployjenkins.jar"] 