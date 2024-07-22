# Base image to build and publish the artifact
FROM maven:3.9.8-eclipse-temurin-8 AS builder

# Set up the working directory
WORKDIR /app

# Copy all files to the container
COPY pom.xml /app

# copy the rest of source code 
COPY . /app

# Build the actual application
RUN mvn clean package -DskipTests
