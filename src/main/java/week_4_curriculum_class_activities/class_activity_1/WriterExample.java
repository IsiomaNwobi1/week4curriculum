package week_4_curriculum_class_activities.class_activity_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Writer wr = new FileWriter(desktopPath + "/output.csv");
            String filecontent = "I am learning how to write to a csv file";
            wr.write(filecontent);
            wr.close();
            System.out.println("Successfully written into a csv file");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
