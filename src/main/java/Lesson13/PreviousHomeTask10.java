package Lesson13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PreviousHomeTask10 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("InputText.txt"));
            String text = reader.readLine();
            actionsWithString(text);
        } catch (IOException e) {
            System.out.println("File not exist!");
        }
    }

    private static void actionsWithString(String text) {
        String[] stringArray = text.split("\\.");
        try (FileWriter writer = new FileWriter("OutputText.txt")) {
            String[] array = text.split(" ");
            for (String words : array) {
                writer.write(words + ",");
                writer.write("\n");
            }
            for (int i = 0; i < stringArray.length; i++) {
                String result = (Character.toUpperCase(stringArray[i].trim().
                        charAt(0)) + stringArray[i].trim().substring(1) + ". ");
                writer.write(result);
            }
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
