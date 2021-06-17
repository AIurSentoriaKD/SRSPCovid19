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
public class DataPruebaModel {
    StringProperty idprueba,
            costo,
            resultado,
            tipo,
            fecha_prueba,
            periodica,
            idhistorial;
    
    public DataPruebaModel(
            String idprueba,
            String costo,
            String resultado,
            String tipo,
            String fecha_prueba,
            String periodica,
            String idhistorial
    ){
        this.idprueba = new SimpleStringProperty(idprueba);
        this.costo = new SimpleStringProperty(costo);
        this.resultado = new SimpleStringProperty(resultado);
        this.tipo = new SimpleStringProperty(tipo);
        this.fecha_prueba = new SimpleStringProperty(fecha_prueba);
        this.periodica = new SimpleStringProperty(periodica);
        this.idhistorial = new SimpleStringProperty(idhistorial);
    }
    
     //GETTERS
    public String getidprueba(){
        return idprueba.get();
    }
    public String getcosto(){
        return costo.get();
    }
    public String getresultado(){
        return resultado.get();
    }
    public String gettipo(){
        return tipo.get();
    }
    public String getfecha_prueba(){
        return fecha_prueba.get();
    }
    public String getperiodica(){
        return periodica.get();
    }
    public String getidhistorial(){
        return idhistorial.get();
    }
    
    //SETTERS
    public void setidprueba(String value){
        idprueba.set(value);
    }
    public void setcosto(String value){
        costo.set(value);
    }
    public void setresultado(String value){
        resultado.set(value);
    }
    public void settipo(String value){
        tipo.set(value);
    }
    public void setfecha_prueba(String value){
        fecha_prueba.set(value);
    }
    public void setperiodica(String value){
        periodica.set(value);
    }
    public void setidhistorial(String value){
        idhistorial.set(value);
    }
    
    //property
    public StringProperty idpruebaProperty(){
        return idprueba;
    }
    public StringProperty costoProperty(){
        return costo;
    }
    public StringProperty resultadoProperty(){
        return resultado;
    }
    public StringProperty tipoProperty(){
        return tipo;
    }
    public StringProperty fecha_pruebaProperty(){
        return fecha_prueba;
    }
    public StringProperty periodicaProperty(){
        return periodica;
    }
    public StringProperty idhistorialProperty(){
        return idhistorial;
    }
}