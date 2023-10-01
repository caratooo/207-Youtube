package api;

import entity.Channel;
import okhttp3.*;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class MongoYoutubeDB implements YoutubeDB{
    private static final String API_URL = "https://www.googleapis.com/youtube/v3";
    // load API_TOKEN from env variable.
    private static final String API_TOKEN = System.getenv("API_TOKEN");

    public static String getApiToken() {
        return API_TOKEN;
    }
    @Override
    public Channel getChannel(String id) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();
        Request request = new Request.Builder()
                .url(String.format("https://www.googleapis.com/youtube/v3/channel?part=statistics&id=", id, "&key=", API_TOKEN))
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(response);
            JSONObject responseBody = new JSONObject(response.body().string());

            if (responseBody.getInt("status_code") == 200) {
                JSONObject channel = responseBody.getJSONObject("id");
                return Channel.builder()
                        .id(channel.getString("id"))
                        .build();
            } else {
                throw new RuntimeException(responseBody.getString("message"));
            }
        } catch (IOException | JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
