package week_4_curriculum_class_activities.class_activity_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            FileInputStream fs = new FileInputStream(desktopPath + "/output.csv");

            int data;

            while ((data = fs.read()) != -1) {
                System.out.print((char) data);
            }

            fs.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
