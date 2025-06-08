package com.example.eventplanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EventListController {

    @FXML
    private ListView<Event> eventListView;
    @FXML
    private Button addEventButton;

    private final ObservableList<Event> eventList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        eventListView.setItems(eventList);
    }

    @FXML
    private void handleAddEvent() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddEventView.fxml"));
            Scene scene = new Scene(loader.load());
            Stage stage = new Stage();
            stage.setTitle("Add Event");
            stage.setScene(scene);
            stage.initModality(Modality.APPLICATION_MODAL);

            AddEventController controller = loader.getController();
            controller.setEventListController(this);

            stage.showAndWait();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addEvent(Event event) {
        eventList.add(event);
    }
}