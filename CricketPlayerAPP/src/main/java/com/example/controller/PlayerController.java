package com.example.controller;

import com.example.model.ApiResponse;
import com.example.model.Player;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class PlayerController {
    // API endpoint for fetching player data
    private static final String API_URL = "https://api.cricapi.com/v1/players?apikey=af97e3d7-f56c-4466-bd0e-da01fb06a1cd&offset=0";

    // Method to fetch and parse player data from the API
    public List<Player> getPlayers() throws IOException {
        // Create an HTTP client and execute the GET request
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet request = new HttpGet(API_URL);
        HttpResponse response = httpClient.execute(request);

        // Convert the response entity to a JSON string
        String json = EntityUtils.toString(response.getEntity());

        // Parse the JSON string into an ApiResponse object
        Gson gson = new Gson();
        Type responseType = new TypeToken<ApiResponse>() {}.getType();
        ApiResponse apiResponse = gson.fromJson(json, responseType);

        // Return the list of players from the ApiResponse
        return apiResponse.getData();
    }
}
