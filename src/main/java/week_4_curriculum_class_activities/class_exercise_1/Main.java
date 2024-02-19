package week_4_curriculum_class_activities.class_exercise_1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {


        String desktopPath = System.getProperty("user.home") + "/Desktop";
       // List<Student> students = new ArrayList<>();

        Student[] students = {
                new Student(56,"Mercy","usman","21/4/1998","Female", 26),
                new Student(57,"Onyi","Okoro","28/4/2000","Male", 24),
                new Student(58,"Rose","Eze","20/4/1999","Female", 25),
                new Student(59,"Emma","Mbah","2/4/1996","Male", 28),
                new Student(60,"Chuks","Amachree","8/4/1997","Male", 27),
        };

        try {
            FileWriter fileWriter = new FileWriter(desktopPath + "/StudentObject.csv");
            fileWriter.write("AdmissionNumber, FirstName, LastName, DateOfBirth, Gender, Age\n");

            for(Student fileContent : students ){
                fileWriter.write(fileContent.getAdmissionNumber() + ",");
                fileWriter.write(fileContent.getFirstName() + ",");
                fileWriter.write(fileContent.getLastName() + ",");
                fileWriter.write(fileContent.getDateOfBirth() + ",");
                fileWriter.write(fileContent.getGender() + ",");
                fileWriter.write(fileContent.getAge() + "\n");

                System.out.println("Successful");
            }
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
