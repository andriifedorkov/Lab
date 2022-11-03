package com.example.lab3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600,600);
        stage.setTitle("Адресна книга");
        stage.setResizable(false);
        stage.setOnCloseRequest(windowEvent -> {
            exit(stage);
        });

        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }

        void exit (Stage stage) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Вихід з програми");
            alert.setContentText("Чи дійсно ви бажаєте вийти з програми?");
            if (alert.showAndWait().get() == ButtonType.OK) {
                stage.close();
                System.out.println("Ви успішно вийшли з програми");

            }
        }
}