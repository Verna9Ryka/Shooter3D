package com.example.shooter3d;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onNewGameButtonClick() {
        welcomeText.setText("NewGame");
    }
    @FXML
    protected void onSettingsButtonClick() {
        welcomeText.setText("Settings");
    }
    @FXML
    protected void onExitButtonClick() {
        welcomeText.setText("Exit");
    }
}