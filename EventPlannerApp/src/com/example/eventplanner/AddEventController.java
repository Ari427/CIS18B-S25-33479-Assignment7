package com.example.eventplanner;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class AddEventController {

    @FXML
    private TextField titleField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextArea descriptionArea;

    private EventListController eventListController;

    public void setEventListController(EventListController controller) {
        this.eventListController = controller;
    }

    @FXML
    private void handleAddEvent() {
        String title = titleField.getText();
        String description = descriptionArea.getText();
        if (title.isEmpty() || datePicker.getValue() == null) {
            showAlert("Missing Info", "Please provide a title and date.");
            return;
        }
        Event event = new Event(title, datePicker.getValue(), description);
        eventListController.addEvent(event);
        ((Stage) titleField.getScene().getWindow()).close();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}