package week_4_curriculum_class_activities.class_activity_5;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws Exception {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        FileReader fr = new FileReader(desktopPath + "/output.csv");
        BufferedReader br = new BufferedReader(fr);

        int i;
        while ((i = br.read()) !=-1) {
            System.out.print((char) i);
        }
        br.close();
        fr.close();
    }
}
