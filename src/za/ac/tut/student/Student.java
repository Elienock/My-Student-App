package za.ac.tut.student;

import za.ac.tut.contactdetails.ContactDetails;

public class Student {
    private String name;
    private String surname;
    private int studentNumber;
    private int age;
    private char gender;
    private ContactDetails contactDetails;

    public Student(){
        this.name="N/A";
        this.surname="N/A";
        this.studentNumber=0;
        this.age=0;
        this.gender='N';
        this.contactDetails=null;
    }
    public Student(String name,String surname,int studentNumber,int age,char gender,ContactDetails contactDetails){
        this.name=name;
        this.surname=surname;
        this.studentNumber=studentNumber;
        this.age=age;
        this.gender=gender;
        this.contactDetails=contactDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(ContactDetails contactDetails) {
        this.contactDetails = contactDetails;
    }

}
