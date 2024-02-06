package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileReader {

    private FileReader() {

    }

    public static void savePhoneNumberToFile(String phoneNumber, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            if (Files.exists(Paths.get(fileName)) && Files.size(Paths.get(fileName)) > 0) {
                // If the file exists and is not empty, add a newline before the new number
                writer.newLine();
            }
            writer.write(phoneNumber);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    public static String getRandomPhoneNumberFromFile(String fileName) {
        List<String> phoneNumbers = readPhoneNumbersFromFile(fileName);

        if (!phoneNumbers.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(phoneNumbers.size());
            return phoneNumbers.get(randomIndex);
        } else {
            return "No phone numbers available";
        }
    }

    public static List<String> readPhoneNumbersFromFile(String fileName) {
        List<String> phoneNumbers = new ArrayList<>();

        try {
            // Read all phone numbers from the file
            Path filePath = Paths.get(fileName);
            phoneNumbers = Files.readAllLines(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return phoneNumbers;
    }
}
