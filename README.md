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

3. Databases - A relational database to store persistent data from the project. Two databases were used in this project, a local H2 database which was used for testing the back-end and a MySQL database for storing the persistent data from the application.

4. Java SE & Spring Boot - Functional application created in OOP (Object-Oriented Programming) language which meets requirements of Kanban board.

5. Testing - Acceptable level of test coverage on back-end (JUnit, MockMVC and Mockito).

### Planning Resources:
Using Jira Software I created a Kanban board modelled as a Scrum and created the user stories. Here are pictures of my Jira Board below:

![Full Board - In Progress](https://user-images.githubusercontent.com/93253355/148922710-2ff8a211-59ca-460a-9102-daf1ad7a9186.jpeg)
![Database Expansion - InProgress](https://user-images.githubusercontent.com/93253355/148922848-33f3b1d1-bf46-4f06-879d-175fa08ed4a4.jpeg)
![FrontEnd Expansion - Done](https://user-images.githubusercontent.com/93253355/148922868-07ecce9e-a63a-428f-9ae9-07f6c0c36840.jpeg)

Once I had decided on my user stories I started to think about the design for the website. I created two wireframe mockups and stuck to this throughout my front-end creation.

![Initial UI Mockup](https://user-images.githubusercontent.com/93253355/148923264-3e8695b4-bc37-49e9-8a0c-f62a10b212f6.png)
![Wireframe of website](https://user-images.githubusercontent.com/93253355/148923237-8d7c299e-1a06-422c-b001-d3bd7ceeba46.png)

I set up two git repositories before starting - one for the front-end and one for back-end. This is the latest commits on my network graph from my front-end repository:

![FrontEnd Network Graph](https://user-images.githubusercontent.com/93253355/148923502-8e97bd2b-8cb7-432a-9b57-27bf10be0420.jpeg)

And the latest commits on my networking graph from my back-end respoitory:

![BackEnd Network Graph](https://user-images.githubusercontent.com/93253355/148923496-a59538a2-9e92-48bd-a625-eb342669ec35.jpeg)


### Databases:
H2: The H2 database was created with travel_app-schema.sql and travel_app-data.sql files to automatically populate the fields for testing purposes.
![H2 Console](https://user-images.githubusercontent.com/93253355/148993048-f83f9d67-92f8-4f85-a702-61c9294eaedc.jpeg)
![Photo of travel_app-data sql](https://user-images.githubusercontent.com/93253355/148993509-efaa5ba7-af16-466a-a32a-2389c272bd1c.png)
![Photo of travel_app-schema sql](https://user-images.githubusercontent.com/93253355/148993529-27390245-dda2-4bfe-92b1-b2e39a8658b0.png)

MySQL: This is the layout of my database for the Travel Destination App.
![MySQL](https://user-images.githubusercontent.com/93253355/148994009-b895a46c-ac9a-4c25-ab32-54cbf068cb14.png)


### Front-End: 
This is the initial submission of my front-end.  As you can see it was difficult to read some of the words because of the dark colours of the background image. As a result, I changed it so that it is easier for the user to view.
![Initial Submission of Travel App UI](https://user-images.githubusercontent.com/93253355/148995324-45eb9d0c-4be6-45e6-9a03-f0ab7b4607d2.jpeg)

The front-end is built from HTML, CSS and JavaScript. I used the Bootstrap framework for a few components.
![Final UI](https://user-images.githubusercontent.com/93253355/148923598-d64819ce-66b1-46b0-a017-dfdf3df6880a.jpeg)

CREATE data:
![Create Data](https://user-images.githubusercontent.com/93253355/148923744-e9a7df7d-37d3-4e6c-b798-3f7c1fbda066.jpeg)

READ data:
![Read Data](https://user-images.githubusercontent.com/93253355/148923816-01c06c71-e93e-4fdf-89a9-62c45165e28b.jpeg)

EDIT data:
![Edit Data](https://user-images.githubusercontent.com/93253355/148923755-caf8bc9d-aac3-4895-8dbd-5af615b5f2e0.jpeg)

DELETE data:
![API - Delete popup box](https://user-images.githubusercontent.com/93253355/148923859-5971e9e6-46b9-49a8-a7c8-392abcbce301.png)

### Back-End:
The back-end of this project was created using Java in a Spring Boot Framework. I tried to make sure that my Kanban board requirements were met with the correct mappings in my code.
![All Folders - Eclipse](https://user-images.githubusercontent.com/93253355/148923914-8dc4155e-1836-4883-a3b0-2e4fdf765430.png)

### Testing:
Both integration and unit testing were used on this project. Integration testing: MockMVC.

![Folders of Testing - Eclipse](https://user-images.githubusercontent.com/93253355/148924029-3f9e0f3e-fbb8-406e-8da4-38b33fc21c52.png)

Methods in my Controller:

![Controller Methods - Eclipse](https://user-images.githubusercontent.com/93253355/148924128-26ad9103-6e3d-4c23-a0ec-a57bc3d35e64.png)

Controller Integration Test:

![Controller Integration test- Eclipse](https://user-images.githubusercontent.com/93253355/148924182-81011373-b164-4f00-b52a-5bd2604f46ab.png)

