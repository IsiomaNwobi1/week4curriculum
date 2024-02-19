package week_4_curriculum_class_activities.class_activity_7;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileOutputStream fr = new FileOutputStream(desktopPath + "/output.txt");

        ByteArrayOutputStream b = new ByteArrayOutputStream();
        b.write(65);
        b.writeTo(fr);
        b.close();

        System.out.println("Successful....");
    }
}
