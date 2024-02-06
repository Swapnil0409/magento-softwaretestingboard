package utils;

import java.util.Random;

public class RandomGenerator {

    /**
     * Private constructor to prevent this class from being instantiated. The class done not need to be instantiated
     * as its methods are static.
     */
    private RandomGenerator() {

    }

    public static String randomFirstName() {
        String[] names = {
                "Tom", "Jill", "Frank", "Joe", "Lucy", "Tony", "Aang", "Luke", "Patricia", "Ben",
                "Jimmy", "Bill", "Sandy", "Wilfred", "Sydney", "Phil", "James", "Sam", "Ryan", "Carly"};
        return names[new Random().nextInt(names.length)];
    }

    public static String randomLastName() {
        String[] names = {"Johnson", "Martinez", "Jones", "Thompson", "Freeman", "King", "Smith", "Rodriguez", "Taylor", "Brown", "Miller",
                "Jackson", "Martin", "Adams", "Allen", "Harris", "Lopez", "Wilson", "Wright", "Young"};
        return names[new Random().nextInt(names.length)];
    }

    public static String randomVin() {
        String[] vins = {"WDCGG5GB1AF522448", "1D7RB1CT8BS577854", "1C4NJDEB1CD584247", "5FNYF4H4XDB078633", "3VWJL7AT4EM653221",
                "1FDBF3E67FEC38716", "5N1AR2MNXGC608270", "YV4A22PK7H1125100", "1N6AD0EV2JN724769",
                "1GYS3KKL6MR474372", "1GKS2BKD2NR109291"};
        return vins[new Random().nextInt(vins.length)];
    }

    public static String randomEmail() {
        String characters = "abcdefghijklmnopqrstuvwxyz";
        String randomString = "";
        int length = 8;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        return randomString + "@cdk.com";
    }

    public static String randomPhoneNumber() {
        String numbers = "23456789";
        String randomPhNumbers = "";
        int length = 10;

        Random rand = new Random();

        char[] text = new char[length];

        for (int i = 0; i < length; i++) {
            text[i] = numbers.charAt(rand.nextInt(numbers.length()));
        }

        for (int i = 0; i < text.length; i++) {
            randomPhNumbers += text[i];
        }
        return randomPhNumbers;
    }
}
