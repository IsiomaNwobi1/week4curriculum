package week_4_curriculum_class_activities.class_activity_6;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            File file = new File(desktopPath + "/output1.csv");

            if(file.createNewFile()) {
                System.out.println("New file has been created");
            } else {
                System.out.println("File already exists");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
