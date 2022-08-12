
import model.Student;
import service.FileService;
import service.StudentService;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main  {
    public static void main(String[] args) throws Exception {
        String[] strings = FileService.readLines("test.txt");
        StudentService service = new StudentService();
        Student[] split = service.split(strings);
        FileService.write(split);
    }
}