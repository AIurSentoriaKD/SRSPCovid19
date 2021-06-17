/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author nickn
 */
public class DataSeguimiento {
    StringProperty idhistorial,
            idpaciente,
            nombre,
            numero,
            correo;
    
    public DataSeguimiento(
            String idhistorial,
            String idpaciente,
            String nombre,
            String numero,
            String correo
    ){
        this.idhistorial = new SimpleStringProperty(idhistorial);
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.nombre = new SimpleStringProperty(nombre);
        this.numero = new SimpleStringProperty(numero);
        this.correo = new SimpleStringProperty(correo);
    }
    
    //GETTERS
    public String getidhistorial() {
        return idhistorial.get();
    }
    public String getidpaciente() {
        return idpaciente.get();
    }
    public String getnombre() {
        return nombre.get();
    }
    public String getnumero() {
        return numero.get();
    }
    public String getcorreo() {
        return correo.get();
    }
    
    //SETTERS
    public void setidhistorial(String value){
        idhistorial.set(value);
    }
    public void setidpaciente(String value){
        idpaciente.set(value);
    }
    public void setnombre(String value){
        nombre.set(value);
    }
    public void setnumero(String value){
        numero.set(value);
    }
    public void setcorreo(String value){
        correo.set(value);
    }
    
    //property
    public StringProperty idhistorialProperty(){
        return idhistorial;
    }
    public StringProperty idpacienteProperty(){
        return idpaciente;
    }
    public StringProperty nombreProperty(){
        return nombre;
    }
    public StringProperty numeroProperty(){
        return numero;
    }
    public StringProperty correoProperty(){
        return correo;
    }
}
