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
            idpersonal,
            idhistorial,
            idtratamiento,
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
            distrito,
            fechahistorial,
            sintomas,
            descriesgos,
            descmedicamentos,
            desctratamiento;

    public DataPacientesModel1(
            String idpaciente,
            String idpersonal,
            String idhistorial,
            String idtratamiento,
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
            String distrito,
            String fechahistorial,
            String sintomas,
            String descriesgos,
            String descmedicamentos,
            String desctratamiento
    ) {
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.idpersonal = new SimpleStringProperty(idpersonal);
        this.idhistorial = new SimpleStringProperty(idhistorial);
        this.idtratamiento = new SimpleStringProperty(idtratamiento);
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
        this.fechahistorial = new SimpleStringProperty(fechahistorial);
        this.sintomas = new SimpleStringProperty(sintomas);
        this.descriesgos = new SimpleStringProperty(descriesgos);
        this.descmedicamentos = new SimpleStringProperty(descmedicamentos);
        this.desctratamiento = new SimpleStringProperty(desctratamiento);

    }
    //GETTERS
    public String getidpaciente(){
        return idpaciente.get();
    }
    public String getidpersonal(){
        return idpersonal.get();
    }
    public String getidhistorial(){
        return idhistorial.get();
    }
    public String getidtratamiento(){
        return idtratamiento.get();
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
    public String getfechahistorial(){
        return fechahistorial.get();
    }
    public String getsintomas(){
        return sintomas.get();
    }
    public String getdescriesgos(){
        return descriesgos.get();
    }
    public String getdescmedicamentos(){
        return descmedicamentos.get();
    }
    public String getdesctratamiento(){
        return desctratamiento.get();
    }
    

    //SETTERS
    public void setidpaciente(String value){
        idpaciente.set(value);
    }
    public void setidpersonal(String value){
        idpersonal.set(value);
    }
    public void setidhistorial(String value){
        idhistorial.set(value);
    }
    public void setidtratamiento(String value){
        idtratamiento.set(value);
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
    public void setfechahistorial(String value){
        fechahistorial.set(value);
    }
    public void setsintomas(String value){
        sintomas.set(value);
    }
    public void setdescriesgos(String value){
        descriesgos.set(value);
    }
    public void setdescmedicamentos(String value){
        descmedicamentos.set(value);
    }
    public void setdesctratamiento(String value){
        desctratamiento.set(value);
    }
    
    //property
    public StringProperty idpacienteProperty(){
        return idpaciente;
    }
    public StringProperty idpersonalProperty(){
        return idpersonal;
    }
    public StringProperty idhistorialProperty(){
        return idhistorial;
    }
    public StringProperty idtratamientoProperty(){
        return idtratamiento;
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
    public StringProperty sintomasProperty(){
        return sintomas;
    }
    public StringProperty descriesgosProperty(){
        return descriesgos;
    }
    public StringProperty descmedicamentosProperty(){
        return descmedicamentos;
    }
    public StringProperty desctratamientoProperty(){
        return desctratamiento;
    }
}
