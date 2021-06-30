I created an app  that displays the information of students given a string of informations
To do so I first created a class called Student that will represent a student. A student has a name, surname, student number, age, gender and contact details. Contact details is also a class on its own. It consists of a cell number and an email address as members.


I created another class called StudentsProcessor.This class implemented the following functionalities:

Populate an array of students with student objects through a method called populateStudents.
This method must take an array of students and a string that contains information about the students to be created. The string information is of the following generic form:

studentsInfo="name-surname-studentNumber-age-gender-cellNumber-emailAddress#name-surname-studentNumber-age-gender-cellNumber-emailAddress#name-surname-studentNumber-age-gender-cellNumber-emailAddress " 
The students information string has records of many students. The records are separated by the hash (#) special character. Each record has fields separated by hyphens (-). The method must extract the student information from string and create the students. The created students must then be populated in the array of students.

Determine and return the youngest student from a given list of students.
Search for a specific student from a given list of students.

Lastly, create a frontend class called StudentsManagerApp that will perform the following tasks:

Populate an array of students with student objects. Use the following string information: studentsInfo="Thato-Ranamane-111-20-F-0123-thato@gmail.com#Kasaka-Mulenga-222-30-M-0456-kasa@gmail.com#Rendani-Mudau-333-40-M-0987-rm@gmail.com#Zweli-Zulu-444-50-M-6789-zz@gmail.com#Ajao-Chukwu-555-33-M-8765-ac@gmail.com " 
Display the details of the students.
Determine and display the details of the youngest student.
Search for  a student in the list using the student number as the search key. Display the details of the student
