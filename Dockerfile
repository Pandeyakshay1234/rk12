# Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source code to the container
COPY Main.java /app/Main.java

# Compile the Java program
RUN javac Main.java

# Command to run the Java program
CMD ["java", "Main"]
