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
public class DataPacientesModel1 {

    StringProperty idpaciente,
            nombre,
            apellido,
            dni,
            celular,
            email,
            sexo,
            fechanac,
            peso,
            altura,
            nacionalidad,
            distrito;

    public DataPacientesModel1(
            String idpaciente,
            String nombre,
            String apellido,
            String dni,
            String celular,
            String email,
            String sexo,
            String fechanac,
            String peso,
            String altura,
            String nacionalidad,
            String distrito
    ) {
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.nombre = new SimpleStringProperty(nombre);
        this.apellido = new SimpleStringProperty(apellido);
        this.dni = new SimpleStringProperty(dni);
        this.celular = new SimpleStringProperty(celular);
        this.email = new SimpleStringProperty(email);
        this.sexo = new SimpleStringProperty(sexo);
        this.fechanac = new SimpleStringProperty(fechanac);
        this.peso = new SimpleStringProperty(peso);
        this.altura = new SimpleStringProperty(altura);
        this.nacionalidad = new SimpleStringProperty(nacionalidad);
        this.distrito = new SimpleStringProperty(distrito);

    }
    //GETTERS
    public String getidpaciente(){
        return idpaciente.get();
    }
    public String getnombre(){
        return nombre.get();
    }
    public String getapellido(){
        return apellido.get();
    }
    public String getdni(){
        return dni.get();
    }
    public String getcelular(){
        return celular.get();
    }
    public String getemail(){
        return email.get();
    }
    public String getsexo(){
        return sexo.get();
    }
    public String getfechanac(){
        return fechanac.get();
    }
    public String getpeso(){
        return peso.get();
    }
    public String getaltura(){
        return altura.get();
    }
    public String getnacionalidad(){
        return nacionalidad.get();
    }
    public String getdistrito(){
        return distrito.get();
    }

    //SETTERS
    public void setidpaciente(String value){
        idpaciente.set(value);
    }
    public void setnombre(String value){
        nombre.set(value);
    }
    public void setapellido(String value){
        apellido.set(value);
    }
    public void setdni(String value){
        dni.set(value);
    }
    public void setcelular(String value){
        celular.set(value);
    }
    public void setemail(String value){
        email.set(value);
    }
    public void setsexo(String value){
        sexo.set(value);
    }
    public void setfechanac(String value){
        fechanac.set(value);
    }
    public void setpeso(String value){
        peso.set(value);
    }
    public void setaltura(String value){
        altura.set(value);
    }
    public void setnacionalidad(String value){
        nacionalidad.set(value);
    }
    public void setdistrito(String value){
        distrito.set(value);
    }
    //property
    public StringProperty idpacienteProperty(){
        return idpaciente;
    }
    public StringProperty nombreProperty(){
        return nombre;
    }
    public StringProperty apellidoProperty(){
        return apellido;
    }
    public StringProperty dniProperty(){
        return dni;
    }
    public StringProperty celularProperty(){
        return celular;
    }
    public StringProperty emailProperty(){
        return email;
    }
    public StringProperty sexoProperty(){
        return sexo;
    }
    public StringProperty fechanacProperty(){
        return fechanac;
    }
    public StringProperty pesoProperty(){
        return peso;
    }
    public StringProperty alturaProperty(){
        return altura;
    }
    public StringProperty nacionalidadProperty(){
        return nacionalidad;
    }
    public StringProperty distritoProperty(){
        return distrito;
    }
}
