# CIS18B-S25-33479-Assignment7

Event Planner App using JavaFX

To run the Event Planner App, I would recomend cloning or downloading the repository to get full access of the project. The Main.java file is located in the src/com/example/eventplanner folder. Run this file and the external app will pop up, prompting users to add an event. The event will have a name, date, and an optional description. After creating an event, users can view a list of the events they created. Hope you enjoy the Event Planner App!

- Which JavaFX controls you used.
TextField - for event title input
DatePicker - for selecting the date for the event
TextArea - for entering a description of the event
Button - used to trigger event actions like save or add
ListView - for displaying the list of events created

- How you applied effects, gradients, and animations.
The Inline CSS in the FXML files gave the styles of padding and alignment. The VBox and AnchorPane use spacing and alignment attributes for the layout. 

- How you used JavaFX properties for binding.
JavaFx ObservableList<Event> was used to bind the event list to the ListView so its automatically updated. The EventListView.fxml used fx:id to bind control directly to controller fields. Property binding made it easy to synchronize the UI with the underlying data model.

### Event List View

<img width="581" alt="Screenshot 2025-06-08 at 2 59 00 PM" src="https://github.com/user-attachments/assets/c492c881-e977-45cd-aa53-b98753675fec" />

### Add Event View

<img width="548" alt="Screenshot 2025-06-08 at 2 59 34 PM" src="https://github.com/user-attachments/assets/82814afe-ab3d-44ae-8207-6163773bd887" />

### Updated Event List View

<img width="577" alt="Screenshot 2025-06-08 at 2 59 44 PM" src="https://github.com/user-attachments/assets/00291932-4ede-466c-97d2-9bd62f21a121" />

### Error Message

<img width="544" alt="Screenshot 2025-06-08 at 3 00 35 PM" src="https://github.com/user-attachments/assets/5e603ede-4413-4d94-9ff6-055bd9a102ac" />

