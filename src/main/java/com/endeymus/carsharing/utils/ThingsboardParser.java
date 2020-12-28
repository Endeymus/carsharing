package com.endeymus.carsharing.utils;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ThingsboardParser {
    private String getContent(String key) {
        String json = "";
        String url = String.format("https://demo.thingsboard.io/api/v1/%s/attributes?clientKeys",
                key);
        try {
            json = Jsoup.connect(url).ignoreContentType(true).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public List<Object> getData(String key) {
        String content = getContent(key);
        List<Object> list = new ArrayList<>();
        if (!content.isEmpty()) {
            JSONObject json = new JSONObject(content);
            JSONObject client = json.getJSONObject("client");
            list.add(client.getDouble("latitude"));
            list.add(client.getDouble("longitude"));
            list.add(client.getBoolean("onRoad"));
        }
        return list;
    }
}
