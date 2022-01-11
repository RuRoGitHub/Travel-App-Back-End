# Cloud Native Project - README.md

## Travel Destination App: Front-End 
Ru Rowe, December 2021 - Janauary 2022

### Important Links:
Jira Board Link: https://rrowe.atlassian.net/jira/software/projects/CNP/boards/2 \
Front-End GitHub Link:https://github.com/RuRoGitHub/Travel-App-Front-End \
Back-End GitHub Link: https://github.com/RuRoGitHub/Travel-App-Back-End

### Introduction:
The project brief was to create a CRUD (Create, Read, Update, Delete) application that encapsulated all the core modules covered during the training. The project requirements are set out below: 

1. Project Management - A fully expanded Jira board, clear documentation from a design phase. Code integrated into a Version Control System.

2. Front-End Development - Functioning front-end website with API (Application Programming Interface) integration.

3. Databases - A relational database to store persistent data from the project.

4. Java SE & Spring Boot - Functional application created in OOP (Object-Oriented Programming) language which meets requirements of Kanban board.

5. Testing - Acceptable level of test coverage on back-end (JUnit, MockMVC and Mockito).

### Planning Resources:
Using Jira Software I created a Kanban board modelled as a Scrum and created the user stories. From the user stories I created linked issues for the front and back end of my project to help the structure of the build. I created five main user stories, an example of one is shown here:
![This is an image](

Once I had decided on my user stories I started to think about the design for the website. I created a wireframe and stuck to this throughout my front-end creation.

I set up two git repositories before starting - one for the front-end and one for back-end. This is the network graph from my back-end repository:

### Databases:
Two databases were used in this project, a local H2 database which was used for testing the back-end and a MySQL database for storing the persistent data from the application.

H2: The H2 database was created with plant-schema.sql and plant-data.sql files to automatically populate the fields for testing purposes.

MySQL: This is the layout of my database for the Travel Destination App. It shows the datatype of each column and also that the 'name' field has to be unique.

### Front-End: 
The front-end is built from HTML, CSS and JavaScript. I used the Bootstrap framework for a few components.

The HTML and CSS are used to create the look of the website, I used CSS to animate the plant cards when hovered over for extra user interaction. The JS was used for the API integration using axios.

### Back-End:
The back-end of this project was created using Java in a Spring Boot Framework. I made sure that all of my Kanban board requirements were met with the correct mappings in my code.

### Testing:
Both integration and unit testing was used on this project.
Integration testing: MockMVC.
