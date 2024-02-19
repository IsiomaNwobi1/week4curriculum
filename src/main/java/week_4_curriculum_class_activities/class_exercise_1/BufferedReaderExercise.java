package week_4_curriculum_class_activities.class_exercise_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExercise {
    public static void main(String[] args) throws IOException {
        BufferedReaderExercise ex = new BufferedReaderExercise();
        BufferedReaderExercise.readStudentFile();
    }
     public static void readStudentFile() throws IOException {

         int file;

         String path = System.getProperty("user.home") + "/Desktop";
             FileReader fr = new FileReader(path + "/StudentObject.csv");
         BufferedReader bufferedReader = new BufferedReader(fr);

                while ((file = bufferedReader.read()) != -1){
                    System.out.print((char) file);
                }
         fr.close();
                bufferedReader.close();
    }
}
