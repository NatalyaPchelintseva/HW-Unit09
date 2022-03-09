import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class FileListApp {
    public static void main(String[] args) {
        File currentFolder = new File("D:\\MS Win Projects\\IntellJ IDEA Projects\\HW-Unit09");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM YYYY года, hh-mm-ss");
        Calendar calendar = Calendar.getInstance();

        File[] filesInCurrentFolder = currentFolder.listFiles();
        for (File file : filesInCurrentFolder) {
            System.out.print(file.getName() + "\t");
            calendar.setTimeInMillis(file.lastModified());
            System.out.println("Дата изменения: " + dateFormat.format(calendar.getTime()));
        }
    }
}


