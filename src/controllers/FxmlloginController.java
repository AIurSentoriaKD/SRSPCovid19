/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Moon-
 */
public class FxmlloginController implements Initializable {

    private DBConnector dc;
    @FXML
    private Button btnLogin;
    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField txtPass;
    @FXML
    private Pane panelizq;
    @FXML
    private Label lblMensaje;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void fnLogin(ActionEvent event){
        dc = new DBConnector();
        Connection conn = dc.Connect();
        String txtUsername = txtUsuario.getText();
        String txtPassword = txtPass.getText();
        try{
            ResultSet rs = conn.createStatement().executeQuery("select * from TPersonalMedico where Username ='"+txtUsername+"' and Contraseña = '"+txtPassword+"'");
            String userdb = null, pass = null;
            while(rs.next()){
                System.out.println(rs.getString("IdPersonal")+rs.getString("Username")+rs.getString("Contraseña")+rs.getString("Cargo")+rs.getString("Nombre")+rs.getString("IdPersonal")+rs.getString("apellido")+rs.getString("DNI"));
                userdb = rs.getString("Username");
                pass = rs.getString("Contraseña");
                
            }
            if(txtUsername.equals(userdb) && txtPassword.equals(pass)){
                System.out.println("Acceso Autorizado");
                lblMensaje.setText("Acceso Autorizado");
            }
            else{
                lblMensaje.setText("Acceso Denegado");
                System.out.println("Acceso Denegado");
            }
            //System.out.println("Acceso autorizado");
        }
        catch(SQLException e){
            lblMensaje.setText("Acceso Denegado");
        }
        
    }
    
}
