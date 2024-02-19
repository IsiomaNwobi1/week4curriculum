package week_4_curriculum_class_activities.class_activity_3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileOutputStream out = new FileOutputStream(desktopPath + "/output.csv");
            String wr = "I am still learning how to write into a csv file";
            byte[] bytes = wr.getBytes();
            out.write(bytes);
            out.close();
            System.out.println("Successful");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

