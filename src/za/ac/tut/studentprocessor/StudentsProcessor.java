package za.ac.tut.studentprocessor;

import za.ac.tut.contactdetails.ContactDetails;
import za.ac.tut.student.Student;

import java.util.List;

public class StudentsProcessor {
    public StudentsProcessor() {

    }
//IndexOf
    public void populateStudents(List<Student> students,String studentsInfo) {
      String[] info= studentsInfo.split("#");

      for(int i=0;i<info.length;i++){
          String[] studentData= info[i].split("-");
              Student student= new Student();

                student.setName(studentData[0]);

                student.setSurname(studentData[1]);

                student.setStudentNumber(Integer.parseInt(studentData[2]));

                student.setAge(Integer.parseInt(studentData[3]));

                student.setGender(studentData[4].charAt(0));

                student.setContactDetails(new ContactDetails(studentData[5],studentData[6]));

                //store
          students.add(student);
          }
      }


    public Student determineTheYoungest(List <Student> students) {
        Student studentAtI, studentAtJ;
        int ageOfStudentAtI, ageOfStudentAtJ;
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                //get a student at index I
                studentAtI = students.get(i);

                //get a student at Index J
                studentAtJ = students.get(j);

                //get the age of student at index I
                ageOfStudentAtI = studentAtI.getAge();

                //get the age of student at index J
                ageOfStudentAtJ = studentAtJ.getAge();

                //compare the ages
                if (ageOfStudentAtI > ageOfStudentAtJ) {
                    //swap the students
                    students.set(i, studentAtJ);
                    students.set(j, studentAtI);

                }
            }
        }
        return students.get(0);
    }

    public int searchStudent(List<Student> students, int studentNumber) {
        int i = 0;
        while ((i < students.size() && ((Student) students.get(i)).getStudentNumber() != studentNumber)) {
            i++;
        }
        if (i == students.size()) {
            i = -1;
        }
        return i;
    }
}
