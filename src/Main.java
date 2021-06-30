import za.ac.tut.student.Student;
import za.ac.tut.studentprocessor.StudentsProcessor;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// Declare Variables
        String studentsInfo="Thato-Ranamane-111-20-F-0123-thato@gmail.com#Kasaka-Mulenga-222-30-M-0456-kasa@gmail.com#Rendani-Mudau-333-40-M-0987-" +
                "rm@gmail.com#Zweli-Zulu-444-50-M-6789-zz@gmail.com#Ajao-Chukwu-555-33-M-8765-ac@gmail.com ";

        List<Student> students= new ArrayList<>();
        StudentsProcessor sp =new StudentsProcessor();
        Student youngest;

        sp.populateStudents(students,studentsInfo);

       youngest =sp.determineTheYoungest(students);

        displayStudentsInfo(students,youngest);

      int index=  sp.searchStudent(students,Integer.parseInt(JOptionPane.showInputDialog("Enter student number to search student")));

      if(index==-1){
          JOptionPane.showMessageDialog(null,"The student has not been found","ERROR",JOptionPane.ERROR_MESSAGE);
      }else{
          //displaying the information of the youngest student
          JOptionPane.showMessageDialog(null,"The account has been found " + "\n" +
                                                            "Name: " + students.get(index).getName() + "\n" +
                                                            "Surname: "+ students.get(index).getSurname() + "\n" +
                                                            "Student Number: " + students.get(index).getStudentNumber() + "\n" +
                                                            "Age: " + students.get(index).getAge() + "\n" +
                                                            "Gender: " + students.get(index).getGender() + "\n" +
                                                            "Cellphone number: " + students.get(index).getContactDetails().getCellNum() + "\n" +
                                                            "Email address: " + students.get(index).getContactDetails().getEmail(),"Information",
                                                            JOptionPane.INFORMATION_MESSAGE);
      }

    }
    public static void displayStudentsInfo(List <Student> students,Student youngest){
        Student student;
        String data="", youngestDisplay="";
        for(int i=0;i<students.size();i++){
            //get student at index
            student= students.get(i);
            //display
            data = data + "Name: " + student.getName() + "\n" +
                    "Surname: "+ student.getSurname() + "\n" +
                    "Student Number: " + student.getStudentNumber() + "\n" +
                    "Age: " + student.getAge() + "\n" +
                    "Gender: " + student.getGender() + "\n" +
                    "Cellphone number: " + student.getContactDetails().getCellNum() + "\n" +
                    "Email address: " + student.getContactDetails().getEmail() + "\n" +
                    "---------------------- " + "\n\n";

        }
        youngestDisplay = youngestDisplay + "Name: " + youngest.getName() + "\n" +
                "Surname: "+ youngest.getSurname() + "\n" +
                "Student Number: " + youngest.getStudentNumber() + "\n" +
                "Age: " + youngest.getAge() + "\n" +
                "Gender: " + youngest.getGender() + "\n" +
                "Cellphone number: " + youngest.getContactDetails().getCellNum() + "\n" +
                "Email address: " + youngest.getContactDetails().getEmail();
        //display
        JOptionPane.showMessageDialog(null, data,"Info",JOptionPane.INFORMATION_MESSAGE);
        //displaying the youngest student
        JOptionPane.showMessageDialog(null,"The youngest Student" + "\n" +
                youngestDisplay);
    }
}
