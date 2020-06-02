package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    public TextField filter_text_box;
    public TableView<Patient> mainTable;
    private ObservableList<Patient> patients;
    private final ArrayList<Patient> filtered_patients = new ArrayList<Patient>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO wczytanie danych do tabeli
    }

    public void add(ActionEvent actionEvent) {
    }

    public void showDetails(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
    }


    public void filtering(KeyEvent onKeyReleased) {
        filtered_patients.clear();
        for(Patient patient : patients) {
            if (patient.name.toLowerCase().contains(filter_text_box.getText().toLowerCase())) {
                filtered_patients.add(patient);
            }
        }
        mainTable.setItems(FXCollections.observableArrayList(filtered_patients));
    }



    public void exit(ActionEvent actionEvent) {
    }
}
