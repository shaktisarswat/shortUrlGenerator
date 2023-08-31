package com.shorturl;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class TestShortUrl {
    private static ShortUrl shortUrl;

    @BeforeAll
    public static void setup() {
        shortUrl = new ShortUrl();
    }

    @Test
    @DisplayName("Checking the correctness of Short URL")
    public void checkingShortUrl() {
        String url1 = shortUrl.registerNewUrl("http://abc1.com");
        // From the short URL url1, remove the common section (http://short.url/) and remove any non alphanumeric character
        String choppedUrl = url1.replace("http://short.url/", "").replaceAll("[^A-Za-z0-9]", "");
        System.out.println(choppedUrl);
        // The result should have only alphanumeric characters and be 9 characters long
        assertTrue(choppedUrl.length() == 9);
    }

    @Test
    @DisplayName("Checking is there any redundency possible")
    public void testRedundency()
    {
        String url3 = shortUrl.registerNewUrl("http://abc3.com");
        // Try to update new URL to map to existing short URL, should return null
        String urlNull = shortUrl.registerNewUrl("http://abc7.com", url3);
        assertNull(urlNull);
    }
}
