package com.shorturl;

import java.util.Random;

public class RandomUrlGenerator {
    private static final int SHORT_URL_LENGTH = 9;
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    private Random random;

    RandomUrlGenerator() {
        random = new Random();
    }

    public String generateRandomUrl() {

        char[] result = new char[SHORT_URL_LENGTH];

        for (int i = 0; i < SHORT_URL_LENGTH; i++) {

            int randomIndex = random.nextInt(ALPHABET.length() - 1);

            result[i] = ALPHABET.charAt(randomIndex);

        }
        return new String(result);
    }

}
