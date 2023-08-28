package urlShortner;

import java.util.HashMap;
import java.util.Map;

public class URLShortner {
    private Map<String, String> urlMap;

    public URLShortner() {
        urlMap = new HashMap<>();
    }

    // Method to generate a short URL
    public String shortenUrl(String longUrl) {
        String shortUrl = generateShortUrl();
        urlMap.put(shortUrl, longUrl);
        return shortUrl;
    }
    public String getUrl(String shortUrl) {
        return urlMap.get(shortUrl);
    }

    

    // Method to generate a random short URL
    private String generateShortUrl() {
        // Logic to generate a short URL (you can use your own logic)
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int length = 8;
        StringBuilder shortUrl = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex =(int) (Math.random() * allowedChars.length());
            char randomChar = allowedChars.charAt(randomIndex);
            shortUrl.append(randomChar);
        }
        return shortUrl.toString();
    }

    public static void main(String[] args) {
        URLShortner urlShortener = new URLShortner();
        

        // Shorten a URL
        String longUrl = "https://www.example.com";
        String shortUrl = urlShortener.shortenUrl(longUrl);
        System.out.println("Short URL: " + shortUrl);
        String retrievedUrl = urlShortener.getUrl(shortUrl);
        System.out.println("Retrieved URL: " + retrievedUrl);

        
    }
}

