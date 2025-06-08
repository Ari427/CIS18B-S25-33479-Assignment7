package com.example.eventplanner;

import java.time.LocalDate;

public class Event {
    private String title;
    private LocalDate date;
    private String description;

    public Event(String title, LocalDate date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
    }

    public String getTitle() { return title; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return title + " (" + date + ")";
    }
}