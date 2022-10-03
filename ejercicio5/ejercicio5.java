import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ejercicio5 {
    public static void main(String[] args) {
        Reader reader;
        {
            try {
                reader = new FileReader("file.txt");
                int current = reader.read();
                while (current != -1) {
                    System.out.print((char) current);
                    current = reader.read();
                }
                reader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

