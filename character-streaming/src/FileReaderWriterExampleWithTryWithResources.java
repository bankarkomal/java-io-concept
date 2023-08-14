import java.io.*;

//Two abstract classes -> Read and Write.
//FileReader extends Reader class.
//FileWriter extends Writer class.
// FileReader we Read character from Specified file.
//FileWriter we Write character from specified file.
public class FileReaderWriterExampleWithTryWithResources {
    public static void main(String[] args) throws IOException {
        try (Reader FileReader = new FileReader("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Input.txt"))
        {
           FileReader.ready();
           int size = 100;
          char[] charsFromFile = new char[size]; // All arrays have fixed length.
            FileReader.read(charsFromFile);
            System.out.println(charsFromFile);
            try (Writer FileWriter =new FileWriter("C:\\Users\\Admin\\IdeaProjects\\java-io-concept-2\\character-streaming\\src\\Output.txt"))
            {
                FileWriter.write(charsFromFile);

            } catch (IOException ioException){
                System.out.println(ioException.getMessage());
            }

        }catch (IOException ioException){
            System.out.println(ioException.getMessage());
        }

    }
}
