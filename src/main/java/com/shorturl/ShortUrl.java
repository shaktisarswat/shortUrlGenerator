package com.shorturl;

import java.util.HashMap;
import java.util.Map;

public class ShortUrl implements IShortUrl{
    private Map<String, String> shortToLongMapping;

    private Map<String, String> longToShortMapping;

    RandomUrlGenerator randomUrlGenerator;

    private static final String URL = "http://short.url/";

    public ShortUrl(){

        shortToLongMapping = new HashMap<>();

        longToShortMapping = new HashMap<>();

        randomUrlGenerator = new RandomUrlGenerator();

    }
    @Override
    public String registerNewUrl(String longUrl) {
        return null;
    }

    @Override
    public String registerNewUrl(String longUrl, String shortUrl) {
        return null;
    }

    @Override
    public String getUrl(String shortUrl) {
        return null;
    }

    @Override
    public Integer getHitCount(String longUrl) {
        return null;
    }

    @Override
    public String delete(String longUrl) {
        return null;
    }
}
