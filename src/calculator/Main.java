package calculator.reader;

import calculator.reader.fileLineReader.FileLineReader;
import calculator.reader.fileReader.FileReader;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader();
            List<String> fileData = fileReader.scanFile();
            FileLineReader fileLineReader = new FileLineReader();
            int noOfLine = fileLineReader.countLine();
            System.out.println(noOfLine);
            for (int i = 0; i <noOfLine; i++)
                System.out.println(fileData.get(i));
        } catch (FileNotFoundException e) {
            System.out.println("ErrorOccurred " + e.getMessage());
        }
    }
}
