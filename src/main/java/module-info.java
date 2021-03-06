module com.example.shooter3d {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.example.shooter3d to javafx.fxml;
    exports com.example.shooter3d;
    exports com.example.shooter3d.controllers;
    opens com.example.shooter3d.controllers to javafx.fxml;
}