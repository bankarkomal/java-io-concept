import java.io.*;

// Two abstract classes -> Reader and Writer.
// FileReader extends Reader class.
//FileWriter extends Writer class.
// FileReader will read characters from specified files.
// FileWriter will read characters into the specified files.
public class FileReaderWriterExample {
    public static void main(String[] args)  throws IOException {
        Reader FileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Input.txt");
        System.out.println(FileReader.ready());

        int Size = 100;
        char[] charsFromFile = new char[Size];
        FileReader.read(charsFromFile);
        System.out.println(charsFromFile);
        FileReader.close();

        Writer FileWriter = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Output.txt");
        FileWriter.write(charsFromFile);
        FileWriter.close();
    }
}
