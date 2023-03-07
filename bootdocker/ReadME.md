# BootDocker Spring Boot Application

## Development

### Build and Run

Without IDE, we can build and run via Gradle

Run Directly

```bash
./gradlew bootRun
```

Build jar and then Run

```bash
./gradlew bootJar
java -jar build/libs/bootdocker-0.0.1-SNAPSHOT.jar
```

#### Docker File Creation

Create Dockerfile having the following components to run on Docker container

```dockerfile
#ENV : For Environment Virables 
#EXPOSE

#FROM scratch : For build from scratch

FROM openjdk:17-alpine

COPY build/libs/bootdocker-0.0.1-SNAPSHOT.jar /app.jar

CMD ["java","-jar","/app.jar"]

```

Following Docker Commands to run

```bash
#Run on Project Absolute Path where Dockerfile exists
docker build -t bootdocker:1 .

##TROUBLESHOOTING - Incase of platform error(For example - Mac OS) is faced run below command
docker build --platform linux/amd64 -t bootdocker:1 .

##To view Image created
docker images

##To push Docker Image on Docker Hub
docker login
#or with Access token
docker login --username <username>

#Tag the image
docker tag bootdocker:1 docker-sample:bootdocker

docker image push bootdocker:1
#or
docker tag push docker-sample:bootdocker

#Run Boot Docker Container
docker run -d --name bootdocker1 -p 8080:8080 bootdocker:1 
```