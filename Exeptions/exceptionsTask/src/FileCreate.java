import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileCreate {
    User user;

    public FileCreate() {
        this.user = user;
    }

    public static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }

    public void createFile(User user) throws Exception {
        File myFile = new File(user.getLastName());
        if (isFileExists(myFile)) {
            try {
                Files.write(Paths.get(user.getLastName()), user.getName().getBytes(), StandardOpenOption.APPEND);
            } catch (IOException e) {
                System.out.println("Некорректное имя файла!");
            }
        } else {
            myFile.createNewFile();
            FileOutputStream outputStream = new FileOutputStream(myFile);
            byte[] buffer = user.getName().getBytes();
            outputStream.write(buffer);
            outputStream.close();
        }
    }
}
