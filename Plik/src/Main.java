import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //InputStreamReader
        try
        {
            List<String> allLines = Files.readAllLines(Paths.get("plik.txt"));
            System.out.println(allLines);
        }
        catch (IOException e) {
            System.out.println("NOK");
        }


        /*
        try
        {
            FileWriter fileWriter = new FileWriter("plik1.txt", true); //ten true
            // powoduje że można dopisywać do pliku, jeśli chcemy nadpisać plik to to usuwamy
            BufferedWriter buffer = new BufferedWriter(fileWriter);

            buffer.write("NOWA LINIA2\n");//dodanie lini do pliku
            buffer.write("NOWA LINIA332\n");
            buffer.newLine();// nowa linia w pliku
            buffer.close();

        }
        catch (IOException e)
        {
            System.out.println("BLAD ZAPISU");
        }

*/


      /*  try
        {
            File file = new File("plik.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("NIE MA PLIKU");
        }
        */
    /*
        try
        {
            File file = new File("plik.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);

            String line;
            while((line = buffer.readLine())!= null)
            {
                System.out.println(line);
            }
            buffer.close();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
*/
    }


}