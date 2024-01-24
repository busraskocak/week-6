import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text : ");
        String text = scanner.nextLine();

        printFile("notes.txt", text);

        String lastSavedText = readFromFile("notes.txt");
        System.out.println("Content of the file : " + lastSavedText);
    }


    private static void printFile(String fileName, String text) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            printWriter.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String readFromFile(String fileName) {
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                text.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}
