package week_4_curriculum_class_activities.class_activity_2;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try {
            Reader r = new FileReader(desktopPath + "/output.csv");
            int readContent = r.read();

            while (readContent != -1){
                System.out.print((char) readContent);
                readContent = r.read();
            }
            r.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

