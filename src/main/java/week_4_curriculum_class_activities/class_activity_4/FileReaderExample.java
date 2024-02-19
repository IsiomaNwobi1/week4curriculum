package week_4_curriculum_class_activities.class_activity_4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";


            FileReader fr = new FileReader(desktopPath + "/output.csv");

            int i;
            while ((i = fr.read()) != -1){
            System.out.print((char) i);
        }
            fr.close();
    }
}

