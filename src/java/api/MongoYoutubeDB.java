package api;

public class MongoYoutubeDB {
    private static final String API_URL = "https://www.googleapis.com/youtube/v3";
    // load API_TOKEN from env variable.
    private static final String API_TOKEN = System.getenv("API_TOKEN");

    public static String getApiToken() {
        return API_TOKEN;
    }
}
