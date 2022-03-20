package com.example.shooter3d;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.effect.Light;
import javafx.scene.effect.Lighting;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class MenuController {
    @FXML
    private Label title;
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