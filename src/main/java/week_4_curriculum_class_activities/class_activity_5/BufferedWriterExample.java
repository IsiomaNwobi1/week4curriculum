package week_4_curriculum_class_activities.class_activity_5;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        String desktopPath = System.getProperty("user.home") + "/Desktop";
        FileWriter fr = new FileWriter(desktopPath + "/output.csv");

        BufferedWriter br = new BufferedWriter(fr);
        br.write("I am still learning how to write into a csv file");
        br.close();

        System.out.println("Write successfully");
    }
}
