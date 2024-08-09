package com.example.model;

import java.util.List;

public class ApiResponse {
    private String status; // Status of the API response
    private List<Player> data; // List of Player objects

    // Getter for status
    public String getStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(String status) {
        this.status = status;
    }

    // Getter for data
    public List<Player> getData() {
        return data;
    }

    // Setter for data
    public void setData(List<Player> data) {
        this.data = data;
    }
}
