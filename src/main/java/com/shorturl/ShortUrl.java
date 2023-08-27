package com.shorturl;

import java.util.HashMap;
import java.util.Map;

public class ShortUrl implements IShortUrl {
    private Map<String, String> shortToLongMapping;

    private Map<String, String> longToShortMapping;

    RandomUrlGenerator randomUrlGenerator;

    private Map<String, Integer> longUrlHitCount;

    private static final String URL = "http://short.url/";

    public ShortUrl() {

        shortToLongMapping = new HashMap<>();

        longToShortMapping = new HashMap<>();

        randomUrlGenerator = new RandomUrlGenerator();

        longUrlHitCount = new HashMap<>();

    }

    @Override
    public String registerNewUrl(String longUrl) {
        if (longUrl == null) {
            System.out.println("Error: LongUrl should not be null");
            return null;
        }
        if (longToShortMapping.containsKey(longUrl)) {
            return longToShortMapping.get(longUrl);
        }
        String shortUrl = randomUrlGenerator.generateRandomUrl();
        shortUrl = URL + shortUrl;
        longToShortMapping.put(longUrl, shortUrl);
        shortToLongMapping.put(shortUrl, longUrl);
        return shortUrl;
    }

    @Override
    public String registerNewUrl(String longUrl, String shortUrl) {
        if (longUrl == null || shortUrl == null) {
            System.out.println("Error: ShortUrl or LongUrl can't be passed as NULL");
            return null;
        }
        if (longToShortMapping.containsKey(longUrl)) {
            return null;
        }

        longToShortMapping.put(longUrl, shortUrl);
        shortToLongMapping.put(shortUrl, longUrl);
        return shortUrl;
    }

    @Override
    public String getUrl(String shortUrl) {
        if (shortUrl == null) {
            System.out.println("Error: ShortUrl should not be Null");
            return null;
        }
        if (shortToLongMapping.containsKey(shortUrl)) {
            return shortToLongMapping.get(shortUrl);
        }
        return null;
    }

    @Override
    public Integer getHitCount(String longUrl) {
        if (longToShortMapping.containsKey(longUrl)) {
            longUrlHitCount.put(longUrl, longUrlHitCount.getOrDefault(longUrl, 0) + 1);
            longUrlHitCount.get(longUrl);
        }
        return 0;
    }

    @Override
    public String delete(String longUrl) {
        String shortUrl = longToShortMapping.get(longUrl);
        longToShortMapping.remove(longUrl);
        shortToLongMapping.remove(shortUrl);
        return null;
    }
}
