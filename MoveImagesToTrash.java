import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.awt.Desktop;

public class MoveImagesToTrash {
    public static void main(String[] args) throws Exception {
        // Get the path to the desktop folder saved in to a Path object
        Path desktopPath = Paths.get(System.getProperty("user.home"), "Desktop");

        Stream<Path> files = Files.list(desktopPath);// Creates a stream of paths to the files in the desktop folder
        files.filter(path -> Files.isRegularFile(path))// Filters the stream to only include regular files
                .filter(path -> path.getFileName().toString().toLowerCase().endsWith(".jpg") ||
                        path.getFileName().toString().toLowerCase().endsWith(".png"))// Filters the stream to only
                                                                                     // include files with the
                                                                                     // extensions .jpg or .png
                .forEach(path -> {
                    System.out.println("Moving " + path.getFileName() + " to trash");
                    Desktop.getDesktop().moveToTrash(path.toFile());// Moves the files to the trash. Desktop requires
                                                                    // the awt.desktop package
                });

        files.close();// Closes the stream
    }
}
