package controllers;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class DataPruebaTPacientes {

    StringProperty idhistorial,
            idpaciente,
            nombre,
            fechainscrito,
            edad;

    public DataPruebaTPacientes(String idhistorial, String idpaciente, String nombre, String fechainscrito, String edad) {
        this.idhistorial = new SimpleStringProperty(idhistorial);
        this.idpaciente = new SimpleStringProperty(idpaciente);
        this.nombre = new SimpleStringProperty(nombre);
        this.fechainscrito = new SimpleStringProperty(fechainscrito);
        this.edad = new SimpleStringProperty(edad);
    }

    //Getter's
    public String getidhistorial() {
        return idhistorial.get();
    }

    public String getidpaciente() {
        return idpaciente.get();
    }

    public String getnombre() {
        return nombre.get();
    }

    public String getfechainscrito() {
        return fechainscrito.get();
    }

    public String getedad() {
        return edad.get();
    }

    //Setter's
    public void setidhistorial(String value) {
        idhistorial.set(value);
    }

    public void setidpaciente(String value) {
        idpaciente.set(value);
    }

    public void setnombre(String value) {
        nombre.set(value);
    }

    public void setfechainscrito(String value) {
        fechainscrito.set(value);
    }

    public void setedad(String value) {
        edad.set(value);
    }

    //Property
    public StringProperty idhistorialProperty() {
        return idhistorial;
    }

    public StringProperty idpacienteProperty() {
        return idpaciente;
    }

    public StringProperty nombreProperty() {
        return nombre;
    }

    public StringProperty fechainscritoProperty() {
        return fechainscrito;
    }

    public StringProperty edadProperty() {
        return edad;
    }
}
