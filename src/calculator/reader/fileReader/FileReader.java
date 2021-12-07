package calculator.reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public List<String> scanFile(){
        List<String> fileDatas=null;
        try{
            fileDatas= Files.readAllLines(Paths.get("src/calculator/Sample.txt"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        return fileDatas;
    }
}
