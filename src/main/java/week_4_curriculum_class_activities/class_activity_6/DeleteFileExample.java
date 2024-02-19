package week_4_curriculum_class_activities.class_activity_6;

import java.io.File;

public class DeleteFileExample {
    public static void main(String[] args) {
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        File file = new File(desktopPath + "/output1.csv");

        if(file.delete()) {
            System.out.println("File deleted successfully");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
