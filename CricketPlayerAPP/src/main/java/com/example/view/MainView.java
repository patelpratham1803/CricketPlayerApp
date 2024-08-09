package com.example.view;

import com.example.controller.PlayerController;
import com.example.model.Player;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.util.List;

public class MainView {
    private VBox view; // Container for the UI elements

    public MainView() {
        view = new VBox(); // Initialize the VBox layout
        Text instructions = new Text("Click on a player to see details"); // Instruction text
        ListView<String> listView = new ListView<>(); // List view to display player names

        // Create a PlayerController to fetch player data
        PlayerController playerController = new PlayerController();
        try {
            List<Player> players = playerController.getPlayers(); // Fetch players from the API
            for (Player player : players) {
                // Add player names and countries to the list view
                listView.getItems().add(player.getName() + " (" + player.getCountry() + ")");
            }
        } catch (IOException e) {
            // Handle the case where fetching players fails
            listView.getItems().add("Failed to fetch players");
        }

        // Add the instruction text and list view to the VBox
        view.getChildren().addAll(instructions, listView);
    }

    public VBox getView() {
        return view; // Return the VBox containing the UI
    }
}
