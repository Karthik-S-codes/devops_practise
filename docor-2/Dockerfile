# Step 1: Use Java base image
FROM eclipse-temurin:17

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy Java file into container
COPY LoginApp.java .

# Step 4: Compile Java program
RUN javac LoginApp.java

# Step 5: Run the program
CMD ["java", "LoginApp"]
#docker build -t login-app
#docker run -it login-app
