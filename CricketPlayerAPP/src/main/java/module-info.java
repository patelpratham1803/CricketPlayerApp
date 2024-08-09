module com.example.cricketplayerapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;

    opens com.example to javafx.fxml;
    exports com.example;
    exports com.example.controller;
    opens com.example.controller to javafx.fxml;
    exports com.example.model;
    opens com.example.model to com.google.gson;
    exports com.example.view;
    opens com.example.view to javafx.fxml;
}
