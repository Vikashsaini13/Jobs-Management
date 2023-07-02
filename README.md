# Jobs Application

This is a Spring Boot application that allows users to manage job postings. Users can add new job postings, view a list of all job postings, view a specific job posting by ID, delete a job posting by ID, and get a list of all job postings by job type. The application uses a MySQL database to store job postings and provides RESTful APIs for performing these operations.

## Getting Started

To run the Jobs application locally, follow these steps:

1. Clone the repository to your local machine.
2. Make sure you have Java and Maven installed.
3. Set up a MySQL database and update the `application.properties` file with the appropriate database connection details.
4. Run the application using your preferred IDE or by executing the command `mvn spring-boot:run` in the project's root directory.
5. The application will be accessible at `http://localhost:8080`.

## Endpoints

The following endpoints are available:

- **Add a new job posting**
  - `POST /jobs/addJob`
  - Request body: JSON representation of the job posting

- **Get a list of all job postings**
  - `GET /jobs/getAllJobs`
  - Response: List of all job postings in JSON format

- **Get a specific job posting by ID**
  - `GET /jobs/getJobById/{id}`
  - Path parameter: `id` - ID of the job posting
  
- **Delete a job posting by ID**
  - `DELETE /jobs/deleteJobById/{id}`
  - Path parameter: `id` - ID of the job posting
  
- **Get a list of all job postings by job type**
  - `GET /jobs/getJobByJobType/{jobType}`
  - Path parameter: `jobType` - Job type (FULL_TIME, PART_TIME, CONTRACT)
  - Response: List of job postings with the specified job type in JSON format

## Data Model

The application uses the following data model:

**Jobs**
- `id` (Long): Unique identifier of the job posting
- `title` (String): Title of the job posting
- `description` (String): Description of the job posting
- `location` (String): Location of the job posting
- `salary` (Double): Salary offered for the job posting
- `companyName` (String): Name of the company
- `employerName` (String): Name of the employer
- `jobType` (Enum: FULL_TIME, PART_TIME, CONTRACT): Type of the job
- `appliedDate` (LocalDate): Date when the job posting was applied

## Project Structure

The project follows a standard Spring Boot application structure. Here's an overview of the main directories and files:



- `src/main/java/com/example/Jobs`: Contains the Java source code for the application.
  - `JobsApplication.java`: The main entry point of the Spring Boot application.
  - `controller/JobsController.java`: Implements the REST endpoints for job posting management.
  - `model/Jobs.java`: Defines the `Jobs` entity class representing a job posting.
  - `repository/JobsRepository.java`: Provides the interface for interacting with the database.
  - `service/JobsService.java`: Implements the business logic for job posting management.
- `src/main/resources`: Contains the application configuration and database scripts.
  - `application.properties`: Configures the application properties, such as database connection details.
  - `data.sql`: Contains sample data to be inserted into the database.
  - `schema.sql`: Defines the database schema.
- `src/test/java`: Contains the unit tests for the application.
- `pom.xml`: The project's Maven configuration file that manages dependencies and build settings.
- `README.md`: Documentation file providing an overview of the Jobs application.

## Contributing

Contributions to the Jobs application are welcome. If you find a bug or want to suggest an improvement, please create an issue or submit a pull request.
