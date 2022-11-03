package com.example.lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable{

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnExit;

    @FXML
    private Button btnLabs;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField lnSearch;

    @FXML
    private TableColumn<?, ?> pipcolumn;

    @FXML
    private TableView<?> tbView;

    @FXML
    private TableColumn<?, ?> telcolumn;

    @FXML
    private VBox VboxScene;

    private Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnLabs.setOnAction(actionEvent -> {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("otherLabs.fxml"));
            Stage newStage = new Stage();
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader.load(), 800,600);
            } catch (IOException e) {
                e.printStackTrace();
            }
            newStage.setTitle("Інші практичні");
            newStage.setResizable(false);
            newStage.setScene(scene);
            newStage.show();
        });

    }




    @FXML
    void dbutton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dbutton.fxml"));
        Stage stage = new Stage();
        Scene scene = null;
        try {
            scene = new Scene(fxmlLoader.load(), 400,150);
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage.setTitle("Адресна книга");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(btnAdd.getScene().getWindow());
        stage.show();
    }

    @FXML
    void delbutton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Видалення");

        alert.setHeaderText("Results: ");
        alert.setContentText("Ви успішно видалили запис! ");
        alert.showAndWait();

    }

    @FXML
    void ebutton(ActionEvent event) {

    }

    @FXML
    void exbutton(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Вихід з програми");
        alert.setContentText("Чи дійсно ви бажаєте вийти з програми?");
        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) VboxScene.getScene().getWindow();
            stage.close();
            System.out.println("Ви успішно вийшли з програми");

        }

    }

    @FXML
    void olabs(ActionEvent event) {

    }


    @FXML
    void sbutton(ActionEvent event) {

    }

    @FXML
    void slane(ActionEvent event) {

    }

}

