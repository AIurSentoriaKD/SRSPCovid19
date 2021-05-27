/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. test change
 */
package srspcovid19_bd2;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Moon-asdasdasd
 */
public class SRSPCovid19_BD2 extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        URL dir = new File("src/FXML/FXMLLogin.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(dir);
        Scene scene = new Scene(root);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.setTitle("Iniciar Sesion");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
