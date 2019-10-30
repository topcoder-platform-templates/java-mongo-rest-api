# Topcoder Java API With MongoDB Starter Pack:

## Requirements:
- Docker 17.05+
- Docker-Compose
- MongoDB
- Spring Boot 2.2

## Configuration:
- The application configuration can be found at `src/main/resources/application.properties`
- For running the application on Docker using the provided docker-compose, use the default configuration provided.
- The following configuration parameters are defined:
    - `spring.data.mongodb.host` The database host, can be overwritten by the environment variable DATABASE_HOST, default value is 'database-host' which points the mongodb hosted on docker.
    - `spring.data.mongodb.port` The port on which MongoDB db is listening, default value is 27017, it can be overwritten by the environment variable DATABASE_PORT.
    - `spring.data.mongodb.username` The database username, can be overwritten by the envrionment variable DATABASE_USERNAME.
    - `spring.data.mongodb.password` The database password, can be overwritten by the environment variable DATABASE_PASSWORD.
    - `spring.data.mongodb.authentication-database` The authentication database, it should be set to 'admin'.
    - `spring.data.mongodb.database` The database name, default value is 'java-api-sp', it can be overwritten by the environment variable DATABASE_NAME.
    - `logging.level.root` The root logging level, default value is 'info', it can be overwritten by the environment variable ROOT_LOGGING_LEVEL.
    - `logging.level.com.topcoder.api` The api logging level, default value is 'info', it can be overwritten by the environment variable API_LOGGING_LEVEL.
    - `logging.file` The logging file name, default value is server.log and can be overwritten by the environment variable LOG_FILE.
    - `logging.file.max-size` The logging file maximim size, default value is 50MB and can be overwritten by the environment variable LOG_FILE_MAX_SIZE.
    - `server.port` The port number on which the API will be listening, default value is 8080, it can be overwritten by the environment variable SERVER_PORT.
    - `server.servlet.context-path` The API prefix, default value is '/api/v1', it can overwritten by the environment variable API_PREFIX.

- In docker-compose.yml, the following environment variables are used:
  - DATABASE_USERNAME: The database username, the default value is 'topcoder'.
  - DATABASE_PASSWORD: The database password, the default value is 'Topcoder123'.

A database user and password will be created using the configured environment variables or default values 'topcoder/Topcoder123'.
    
## Deployment on docker:
- Keep the default provided configuration.
- Navigate to the application root folder (java-mongodb) where docker-compose.yml resides and run the following command:

```bash
docker-compose up
```
This will start mongodb database and the API containers, the API will be listening on port 8080.

## Local Deployment:
- Start MongoDB, you can use the provided docker-compose.yml for starting mongodb by running `docker-compose up mongo-db`
- Configure the application as described above by updating src/main/resources/application.properties or by using environment variables.
- If the provided docker-compose.yml is used for starting the database, we only need to update DATABASE_HOST value:
  `export DATABASE_HOST=<Docker-IP>` (replace <Docker-IP> with the IP address of docker machine)
- Run the API by executing the following command :
  `mvn spring-boot:run`

# Verification:
Refer to Validation.md

