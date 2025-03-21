# Use Java 21 as the base image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy and build the application
COPY . .
RUN ./mvnw clean package -DskipTests

# Expose the necessary port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/your-app.jar"]
