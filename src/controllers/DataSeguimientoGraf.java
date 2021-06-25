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
public class DataSeguimientoGraf {
    StringProperty idhistorial,
            idpaciente,
            nombre,
            numero,
            correo,
            sexo,
            dni,
            peso,
            fechanac,
            sintomas;
    
    public DataSeguimientoGraf(
            String idhistorial,
            String idpaciente,
            String nombre,
            String numero,
            String correo,
            String sexo,
            String dni,
            String peso,
            String fechanac,
            String sintomas
    ){
        this.idhistorial = new SimpleStringProperty(idhistorial);
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.nombre = new SimpleStringProperty(nombre);
        this.numero = new SimpleStringProperty(numero);
        this.correo = new SimpleStringProperty(correo);
        this.sexo = new SimpleStringProperty(sexo);
        this.dni = new SimpleStringProperty(dni);
        this.peso = new SimpleStringProperty(peso);
        this.fechanac = new SimpleStringProperty(fechanac);
        this.sintomas = new SimpleStringProperty(sintomas);
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
    public String getsexo() {
        return sexo.get();
    }
    public String getdni() {
        return dni.get();
    }
    public String getpeso() {
        return peso.get();
    }
    public String getfechanac() {
        return fechanac.get();
    }
    public String getsintomas() {
        return sintomas.get();
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
    public void setsexo(String value){
        sexo.set(value);
    }
    public void setdni(String value){
        dni.set(value);
    }
    public void setpeso(String value){
        peso.set(value);
    }
    public void setfechanac(String value){
        fechanac.set(value);
    }
    public void setsintomas(String value){
        sintomas.set(value);
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
    public StringProperty sexoProperty(){
        return sexo;
    }
    public StringProperty dniProperty(){
        return dni;
    }
    public StringProperty pesoProperty(){
        return peso;
    }
    public StringProperty fechanacProperty(){
        return fechanac;
    }
    public StringProperty sintomasProperty(){
        return sintomas;
    }
}
