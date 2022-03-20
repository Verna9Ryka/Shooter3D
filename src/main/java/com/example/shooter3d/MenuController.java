package com.example.shooter3d;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    @FXML
    public Label title;
    @FXML
    protected void onNewGameButtonClick() {

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