package ConfirmSwap;

import MainPage.classSchedule;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class ConfirmSwapController0 implements Initializable {

    @FXML private TableView<classSchedule> tableView0;
    @FXML private TableColumn<classSchedule, String> column1;
    @FXML private TableColumn<classSchedule, String> column2;
    @FXML private TableColumn<classSchedule, String> column3;
    @FXML private TableColumn<classSchedule, String> column4;
    @FXML private TableColumn<classSchedule, String> column5;
    @FXML private TableColumn<classSchedule, String> column6;
    @FXML private TableColumn<classSchedule, String> column7;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        column1.setCellValueFactory(new PropertyValueFactory<>("className"));
        column2.setCellValueFactory(new PropertyValueFactory<>("dayTime"));
        column3.setCellValueFactory(new PropertyValueFactory<>("instructor"));
        column4.setCellValueFactory(new PropertyValueFactory<>("room"));
        column5.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        column6.setCellValueFactory(new PropertyValueFactory<>("endDate"));
        column7.setCellValueFactory(new PropertyValueFactory<>("unit"));

        tableView0.setItems(getDropClasses());
    }

    private ObservableList<classSchedule> getDropClasses() {
        ObservableList<classSchedule> classList = FXCollections.observableArrayList();
        classList.addAll(new classSchedule("Graphical User Interface", "TueThu 8:00AM-10AM", "Ben Steichen",
                        "8-2324", "8/23/2019", "12/15/2019", "3 units"),
                        new classSchedule("Numerical Methods", "MonWed 1:00PM-2:45PM", "John Smith",
                        "8-3745", "8/23/2019", "12/15/2019", "3 units"));

        return classList;
    }
}