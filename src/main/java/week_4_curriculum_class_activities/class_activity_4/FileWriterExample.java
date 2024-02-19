package week_4_curriculum_class_activities.class_activity_4;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileWriter fw = new FileWriter(desktopPath + "/output.csv");
            fw.write("I am learning how to write into a csv file");
            fw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Successfully written into a csv file");
    }
}
