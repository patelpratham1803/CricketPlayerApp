package com.example;

import com.example.view.MainView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CricketPlayerApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Initialize the main view
        MainView mainView = new MainView();

        // Set up the scene with the main view and dimensions
        Scene scene = new Scene(mainView.getView(), 800, 600);

        // Configure the stage (main window) and show it
        stage.setScene(scene);
        stage.setTitle("Cricket Player App");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}