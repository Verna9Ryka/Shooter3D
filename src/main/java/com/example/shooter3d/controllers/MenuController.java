package com.example.shooter3d.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    public Label title;

    @FXML
    protected void onNewGameButtonClick() {

    }

    @FXML
    protected void onStatisticsButtonClick() {

    }

    @FXML
    protected void onSettingsButtonClick() {

    }

    @FXML
    protected void onExitButtonClick() {
        Platform.exit();
        System.exit(0);
    }
}