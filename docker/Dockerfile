# Step 1: Use a Java image
FROM eclipse-temurin:17

# Step 2: Set working directory inside container
WORKDIR /app

# Step 3: Copy Java file into container
COPY Hello.java .

# Step 4: Compile Java program
RUN javac Hello.java

# Step 5: Run the program
CMD ["java", "Hello"]
