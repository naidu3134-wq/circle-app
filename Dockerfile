# Step 1: Use official OpenJDK 17 base image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy built JAR file into the container
COPY target/circle-app-1.0-SNAPSHOT.jar app.jar

# Step 4: Define command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]