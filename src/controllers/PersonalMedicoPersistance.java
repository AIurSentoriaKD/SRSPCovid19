package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Moon-
 */
public class PersonalMedicoPersistance {

    StringProperty idpersonal,
            username,
            contrasenia,
            cargo,
            nombre,
            apellido,
            dni;

    public PersonalMedicoPersistance(
            String idpersonal,
            String username,
            String contrasenia,
            String cargo,
            String nombre,
            String apellido,
            String dni
    ) {
        this.idpersonal = new SimpleStringProperty(idpersonal);
        this.username = new SimpleStringProperty(username);
        this.contrasenia = new SimpleStringProperty(contrasenia);
        this.cargo = new SimpleStringProperty(cargo);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.dni = new SimpleStringProperty(dni);
    }

    //GETTERS
    public String getidpersonal() {
        return idpersonal.get();
    }

    public String getusername() {
        return username.get();
    }

    public String getcontrasenia() {
        return contrasenia.get();
    }

    public String getcargo() {
        return cargo.get();
    }

    public String getnombre() {
        return nombre.get();
    }

    public String getapellido() {
        return apellido.get();
    }

    public String getdni() {
        return dni.get();
    }
    //SETTERS

    public void setIdpersonal(String value) {
        idpersonal.set(value);
    }

    public void setUsername(String value) {
        username.set(value);
    }

    public void setContrasenia(String value) {
        contrasenia.set(value);
    }

    public void setCargo(String value) {
        cargo.set(value);
    }

    public void setNombre(String value) {
        nombre.set(value);
    }

    public void setApellido(String value) {
        apellido.set(value);
    }

    public void setDni(String value) {
        dni.set(value);
    }
    //PROPERTY
    
}
