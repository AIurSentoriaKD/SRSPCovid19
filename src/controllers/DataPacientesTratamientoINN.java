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
 * @author Moon-
 */
public class DataPacientesTratamientoINN {

    StringProperty idpaciente,
            nombre,
            idhistorial,
            idprueba;

    public DataPacientesTratamientoINN(
            String idpaciente,
            String nombre,
            String idhistorial,
            String idprueba
    ) {
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.nombre = new SimpleStringProperty(nombre);
        this.idhistorial = new SimpleStringProperty(idhistorial);
        this.idprueba = new SimpleStringProperty(idprueba);
    }

    //GETTERS
    public String getidpaciente(){
        return idpaciente.get();
    }
    public String getnombre(){
        return nombre.get();
    }
    public String getidhistorial(){
        return idhistorial.get();
    }
    public String getidprueba(){
        return idprueba.get();
    }
    //SETTERS
    public void setidpaciente(String value){
        idpaciente.set(value);
    }
    public void setnombre(String value){
        nombre.set(value);
    }
    public void setidhistorial(String value){
        idhistorial.set(value);
    }
    public void setidprueba(String value){
        idprueba.set(value);
    }
    //PROPERTY
    public StringProperty idpacienteProperty(){
        return idpaciente;
    }
    public StringProperty nombreProperty(){
        return nombre;
    }
    public StringProperty idhistorialProperty(){
        return idhistorial;
    }
    public StringProperty idpruebaProperty(){
        return idprueba;
    }
}
