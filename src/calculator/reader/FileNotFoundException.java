package calculator.reader.fileReader;

public class FileReaderException extends Exception{
    public FileReaderException(Exception e,String message){
        super(message,e);
    }
}
