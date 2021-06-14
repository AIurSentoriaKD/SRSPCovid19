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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Moon-
 */
public class MainwindowController implements Initializable {

    private DBConnector dc;
    private ObservableList<DataPacientesModel1> data;

    @FXML
    private Tab tabDetallesPacientes;
    @FXML
    private TextField txtPPNombre;
    @FXML
    private Button btnActualizarT1;
    @FXML
    private TableView<DataPacientesModel1> TTPacientes1;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CNombre;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CApellido;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CDNI;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CCelular;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CEmail;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CSexo;
    @FXML
    private TableColumn<DataPacientesModel1, String> T1CEdad;
    @FXML
    private Button btnSeguimiento;
    @FXML
    private Button btnEditarDatosPaciente1;
    @FXML
    private Label lblIDpaciente1;
    @FXML
    private TextField txtDateTratamiento;
    @FXML
    private Tab tabPacienteNuevo;
    @FXML
    private ImageView logodealgo;
    @FXML
    private TextField txtDNI2;
    @FXML
    private TextField txtAPMat2;
    @FXML
    private TextField txtPatern2;
    @FXML
    private TextField txtNombres2;
    @FXML
    private TextField txtCorreoE2;
    @FXML
    private TextField txtTelef2;
    @FXML
    private ComboBox<?> cmbNacionac2;
    @FXML
    private ComboBox<?> cmbDistrito2;
    @FXML
    private TextField txtPeso2;
    @FXML
    private DatePicker dateNacPac2;
    @FXML
    private Button btnLimpiarDatos2;
    @FXML
    private TextArea txtASintomas2;
    @FXML
    private ComboBox<?> cmbTipoPrueba2;
    @FXML
    private Label lblPrecioPrueba2;
    @FXML
    private DatePicker datePrueba2;
    @FXML
    private CheckBox chkPeriodica2;
    @FXML
    private Button btnConfirmarDatosdePaciente2;
    @FXML
    private Tab TabTratamientos;
    @FXML
    private TableView<?> tblPacRec3;
    @FXML
    private TableColumn<?, ?> T2CIDPaciente;
    @FXML
    private TableColumn<?, ?> T2CNombre;
    @FXML
    private TableColumn<?, ?> T2IDPrueba;
    @FXML
    private Button btnActualizarTabla2_3;
    @FXML
    private TextField txtBuscaNombre3;
    @FXML
    private TextArea txtAreaDescTrat3;
    @FXML
    private DatePicker dateFechaTratamiento3;
    @FXML
    private Button btnProcRiesgos3;
    @FXML
    private ListView<String> lstListaRiesgos3;
    @FXML
    private Button btnAddRisk3;
    @FXML
    private Button btnRemoveRisk3;
    @FXML
    private Button btnProcMedicacion3;
    @FXML
    private ListView<String> lstRiesgosDePaciente3;
    @FXML
    private ListView<String> lstMedicamentos3;
    @FXML
    private Button btnAgregarMedicamento3;
    @FXML
    private Button btnQuitarMedicamento3;
    @FXML
    private ListView<String> lstMEdicamentosRetadosPaciente3;
    @FXML
    private Button btnFinalizarTratamiento3;
    @FXML
    private Tab TabPruebas;
    @FXML
    private TableView<?> T3HistorlalYPaciente;
    @FXML
    private TableColumn<?, ?> T3CIDHistorial;
    @FXML
    private TableColumn<?, ?> T3CIDPaciente;
    @FXML
    private TableColumn<?, ?> T3CNombre;
    @FXML
    private TableColumn<?, ?> T3CFechaInscrito;
    @FXML
    private TableColumn<?, ?> T3CEdad;
    @FXML
    private TextField txtFiltroNombre4;
    @FXML
    private Button btnActualizarTabla4;
    @FXML
    private Button btnSeleccionarDato4;
    @FXML
    private TextField txtIDPrueba4;
    @FXML
    private ComboBox<?> cmbResultadoPrueba4;
    @FXML
    private Button btnGuardarResultadodePrueba4;
    @FXML
    private Button btnCancelarEstadoPrueba4;
    @FXML
    private TableView<?> T4DatosdePruebas4;
    @FXML
    private TableColumn<?, ?> T4CIdPrueba;
    @FXML
    private TableColumn<?, ?> T4CCosto;
    @FXML
    private TableColumn<?, ?> T4CResultado;
    @FXML
    private TableColumn<?, ?> T4CTipo;
    @FXML
    private TableColumn<?, ?> T4CFechaPrueba;
    @FXML
    private TableColumn<?, ?> T4CPeriodica;
    @FXML
    private Tab TabSeguimiento;
    @FXML
    private Button btnActualizarListaSeguimiento5;
    @FXML
    private TextField txtNombreLstPacientes5;
    @FXML
    private TableView<?> T5HistorlalYPaciente1;
    @FXML
    private TableColumn<?, ?> T5CIDHistorial1;
    @FXML
    private TableColumn<?, ?> T5CIDPaciente1;
    @FXML
    private TableColumn<?, ?> T5CNombre1;
    @FXML
    private TableColumn<?, ?> T5CFechaInscrito1;
    @FXML
    private TableColumn<?, ?> T5CEdad1;
    @FXML
    private TextField txtsexo5;
    @FXML
    private TextField txtDni5;
    @FXML
    private TextField txtEmail5;
    @FXML
    private TextField txtnroTlf5;
    @FXML
    private TextField txtPeso5;
    @FXML
    private TextField txtfechanac5;
    @FXML
    private Label lblIdPacienteSeguimiento;
    @FXML
    private TextArea txtAreaSintomasNuevos5;
    @FXML
    private TextField txtNroSintmasNuevos5;
    @FXML
    private Button bttnGuardarSeguimiento5;
    @FXML
    private BarChart<?, ?> Graf1nroSintomasTiempo5;
    @FXML
    private Tab TabEstadisticas;
    @FXML
    private TableView<?> T7InfectadosPorDistrito;
    @FXML
    private TableColumn<?, ?> T7Distrito;
    @FXML
    private TableColumn<?, ?> T7NroPruebas;
    @FXML
    private TableColumn<?, ?> TC7ResultadoPOS;
    @FXML
    private TableColumn<?, ?> T7ResultadoNEG;
    @FXML
    private Button btnActualizarGrafico7;
    @FXML
    private BarChart<?, ?> grafInfectadosPorDistrito;
    @FXML
    private TextArea txtflDesTratamiento;
    @FXML
    private Label lblIDpaciente11;
    @FXML
    private TextField txtAltura2;
    @FXML
    private Label lblMensaje2;
    @FXML
    private TextArea txtFacctRisk1;
    @FXML
    private TextArea txtSintomas1;
    @FXML
    private TextArea txtMedicacion1;
    @FXML
    private BorderPane mainborder;
    @FXML
    private TextArea txtfldSintomas5;

    //Observable Lists de Factores de Riesgo
    ObservableList<String> lriesgo = FXCollections.observableArrayList("Infeccion", "Asfixia", "Desmayo", "Alergia");
    ObservableList<String> priesgo = FXCollections.observableArrayList(); //no creo que sea necesaria esta linea
    //Observable Lists de Medicamentos
    ObservableList<String> lmedicamentos = FXCollections.observableArrayList("Paracetamol", "Amoxicilina", "Ivermectina", "Panadol");
    ObservableList<String> pmedicamentos = FXCollections.observableArrayList();
    @FXML
    private TextField idhistorial3;
    @FXML
    private TextField idprueba3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        //Inicializa la lista de riesgos
        lstListaRiesgos3.setItems(lriesgo);
        //Inicializa la lista de medicamentos
        lstMedicamentos3.setItems(lmedicamentos);

        dc = new DBConnector();
        //inicializando comoboxes tab2
        List<String> Nacionalidadescmb = new ArrayList<>();
        Nacionalidadescmb.add("Peru");
        Nacionalidadescmb.add("chile");
        Nacionalidadescmb.add("argentina");
        ObservableList Nacionalidadescmblist = FXCollections.observableList(Nacionalidadescmb);
        cmbNacionac2.getItems().clear();
        cmbNacionac2.setItems(Nacionalidadescmblist);

        List<String> Distritoscmb = new ArrayList<>();
        Distritoscmb.add("Santiago");
        Distritoscmb.add("Cusco");
        Distritoscmb.add("Wanchaq");
        ObservableList distritoscmblist = FXCollections.observableList(Distritoscmb);
        cmbDistrito2.getItems().clear();
        cmbDistrito2.setItems(distritoscmblist);

        List<String> tipospruebacmb = new ArrayList<>();
        tipospruebacmb.add("Rapida");
        tipospruebacmb.add("Molecular");
        tipospruebacmb.add("Isopada");

        ObservableList pruebascmblist = FXCollections.observableList(tipospruebacmb);
        cmbTipoPrueba2.getItems().clear();
        cmbTipoPrueba2.setItems(pruebascmblist);

    }

    @FXML
    private void ActualizarTablaPacientes1(ActionEvent event) {
        dc = new DBConnector();
        try {
            Connection conn = dc.Connect();
            Stage stage = (Stage) btnActualizarT1.getScene().getWindow();
            String title = stage.getTitle();
            //System.out.println(title);
            String[] parts = title.split(" ");
            String IDpersonal = parts[0];
            data = FXCollections.observableArrayList();
            String sqlar = "exec uspVer " + IDpersonal;
            ResultSet rs = conn.createStatement().executeQuery(sqlar);

            while (rs.next()) {

                data.add(new DataPacientesModel1(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14),
                        rs.getString(15),
                        rs.getString(16),
                        rs.getString(17),
                        rs.getString(18),
                        rs.getString(19),
                        rs.getString(20)
                ));
            }
            T1CNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
            T1CApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
            T1CDNI.setCellValueFactory(new PropertyValueFactory<>("dni"));
            T1CCelular.setCellValueFactory(new PropertyValueFactory<>("celular"));
            T1CEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
            T1CSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
            T1CEdad.setCellValueFactory(new PropertyValueFactory<>("fechanac"));

            TTPacientes1.setItems(null);
            TTPacientes1.setItems(data);
            //Filtered primer tab
            FilteredList<DataPacientesModel1> filtror = new FilteredList<>(data, b -> true);
            txtPPNombre.textProperty().addListener((observable, oldValue, newValue) -> {
                filtror.setPredicate(ModelTable -> {
                    if (newValue == null || newValue.isEmpty()) {
                        return true;
                    }
                    String lowercaseFilter = newValue.toLowerCase();

                    //int idcliente = ModelTable.getidcliente().toLowerCase().indexOf(lowercaseFilter);
                    if (ModelTable.getapellido().toLowerCase().indexOf(lowercaseFilter) != -1) {
                        return true;
                    } else if (ModelTable.getnombre().toLowerCase().indexOf(lowercaseFilter) != -1) {
                        return true;
                    } else {
                        return false;
                    }

                });
            });

            SortedList<DataPacientesModel1> sortedData = new SortedList<>(filtror);
            sortedData.comparatorProperty().bind(TTPacientes1.comparatorProperty());
            TTPacientes1.setItems(sortedData);
            //conn.close();
        } catch (SQLException e) {
            System.out.println(e);
            e.printStackTrace(System.out);
        }
    }

    @FXML
    private void DarSeguimiento1Redirect(ActionEvent event) {
    }

    @FXML
    private void EditarDatosPaciente(ActionEvent event) {
    }

    @FXML
    private void LimpiarDatos2(ActionEvent event) {
    }

    @FXML
    private void ConfirmarDatosdePaciente2(ActionEvent event) {
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
        String DP_DNI = txtDNI2.getText();
        String DP_APMat = txtAPMat2.getText();
        String DP_APPat = txtPatern2.getText();
        String DP_Nom = txtNombres2.getText();
        String DP_Correo = txtCorreoE2.getText();
        String DP_Tel = txtTelef2.getText();
        String DP_Peso = txtPeso2.getText();
        String DP_Altura = txtAltura2.getText();
        LocalDate date = dateNacPac2.getValue();
        String DP_Sintomas = txtASintomas2.getText();
        String DP_Precio = lblPrecioPrueba2.getText();
        LocalDate date2 = datePrueba2.getValue();

        String DP_Nacionaildad = (String) cmbNacionac2.getValue();
        String DP_Distrito = (String) cmbDistrito2.getValue();
        String DP_TipoPrueba = (String) cmbTipoPrueba2.getValue();

        if (DP_Sintomas.isEmpty() || DP_DNI.isEmpty() || DP_APMat.isEmpty() || DP_APPat.isEmpty() || DP_Nom.isEmpty() || DP_Correo.isEmpty() || DP_Tel.isEmpty() || DP_Peso.isEmpty() || DP_Altura.isEmpty() || date == null || cmbNacionac2.getSelectionModel().isEmpty() || cmbDistrito2.getSelectionModel().isEmpty() || cmbTipoPrueba2.getSelectionModel().isEmpty() || date2 == null) {
            lblMensaje2.setText("Uno o mas de los campos no esta llenado");
        } else {
            System.out.println("Areas de texto completas, comprobando CMBs. . .");
            if (DP_Nacionaildad.isEmpty() || DP_Distrito.isEmpty() || DP_TipoPrueba.isEmpty()) {
                lblMensaje2.setText("La seleccion de los desplegables no puede estar vacia.");
            } else {
                System.out.println("CMBs comprobados, agregando a la base de datos. . .");
                String PPeriodica = null;
                if (chkPeriodica2.isSelected()) {
                    PPeriodica = "SI";
                } else {
                    PPeriodica = "NO";
                }
                dc = new DBConnector();

                try {
                    Connection conn = dc.Connect();
                    String SQLStatement = "select count(*) as total from TPaciente";
                    ResultSet rs = conn.createStatement().executeQuery(SQLStatement);
                    int pacientes = 0;
                    while (rs.next()) {
                        pacientes = rs.getInt(1);
                    }
                    System.out.println(pacientes + 1);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }

        }
    }

    @FXML
    private void ActualizarTablaPacRac3(ActionEvent event) {
    }

    @FXML
    private void GuardarTratamientoEnableRiskFact3(ActionEvent event) {
    }

    @FXML
    private void AddRisk3LtoL(ActionEvent event) {

        //es para que no diga null en el listview
        if (lstRiesgosDePaciente3.getItems().isEmpty()) {
            lstListaRiesgos3.getSelectionModel().getSelectedItem().trim();
        }
        //Si se repiten los elementos seleccionados entonces ya no los agrega
        if (lstRiesgosDePaciente3.getItems().contains(lstListaRiesgos3.getSelectionModel().getSelectedItem())) {
            lstListaRiesgos3.getSelectionModel().getSelectedItem().trim();
        } else {
            lstRiesgosDePaciente3.getItems().add(lstListaRiesgos3.getSelectionModel().getSelectedItem());
        }

    }

    @FXML
    private void RemoveRisk3LtoL(ActionEvent event) {
         lstRiesgosDePaciente3.getItems().remove(lstRiesgosDePaciente3.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void GuardarRiskFactsEnableMedicacion3(ActionEvent event) {
    }

    @FXML
    private void AddMedicament3(ActionEvent event) {
         //es para que no diga null en el listview
        if(lstMEdicamentosRetadosPaciente3.getItems().isEmpty()){
            lstMedicamentos3.getSelectionModel().getSelectedItem().trim();
        }
        //Si se repiten los elementos seleccionados entonces ya no los agrega
        if(lstMEdicamentosRetadosPaciente3.getItems().contains(lstMedicamentos3.getSelectionModel().getSelectedItem())){
            lstMedicamentos3.getSelectionModel().getSelectedItem().trim(); //con esta linea no agrega nada
        }
        else{
            lstMEdicamentosRetadosPaciente3.getItems().add(lstMedicamentos3.getSelectionModel().getSelectedItem());
        }
    }

    @FXML
    private void RemoveMedicament3(ActionEvent event) {
         lstMEdicamentosRetadosPaciente3.getItems().remove(lstMEdicamentosRetadosPaciente3.getSelectionModel().getSelectedItem());
    }

    @FXML
    private void FinalizarTratamientoSaveALLDATA3(ActionEvent event) {
    }

    @FXML
    private void ActualizarTabla3_4(ActionEvent event) {
    }

    @FXML
    private void SeleccionarDato_ADatoPrueba4(ActionEvent event) {
    }

    @FXML
    private void GuardarResultadodePrueba4(ActionEvent event) {
    }

    @FXML
    private void LimpiarDatoResultadodePrueba4(ActionEvent event) {
    }

    @FXML
    private void ActualizarTablaListaSeguimineto5(ActionEvent event) {
    }

    @FXML
    private void GuardarListadeSeguimiento5(ActionEvent event) {
    }

    @FXML
    private void ActualizarGraficoInfectadosPordistrito7(ActionEvent event) {
    }

    @FXML
    private void TabTratamientosChange(Event event) {

    }

    @FXML
    private void llenarPacientesTab1(MouseEvent event) {
        try {
            lblIDpaciente11.setText(TTPacientes1.getSelectionModel().getSelectedItem().getidpaciente());
            txtDateTratamiento.setText(TTPacientes1.getSelectionModel().getSelectedItem().getfechahistorial());
            txtflDesTratamiento.setText(TTPacientes1.getSelectionModel().getSelectedItem().getdesctratamiento());
            txtSintomas1.setText(TTPacientes1.getSelectionModel().getSelectedItem().getsintomas());
            txtFacctRisk1.setText(TTPacientes1.getSelectionModel().getSelectedItem().getdescriesgos());
            txtMedicacion1.setText(TTPacientes1.getSelectionModel().getSelectedItem().getdescmedicamentos());
        } catch (NullPointerException nulo) {
            System.out.println("Error de datos al pasar");
        }
    }

    @FXML
    private void cmbTipoPruebaPrices(ActionEvent event) {
        System.out.println(cmbTipoPrueba2.getValue());
        if (cmbTipoPrueba2.getValue().equals("Rapida")) {
            lblPrecioPrueba2.setText("S/ 50");
        } else if (cmbTipoPrueba2.getValue().equals("Molecular")) {
            lblPrecioPrueba2.setText("S/ 100");
        } else if (cmbTipoPrueba2.getValue().equals("Isopada")) {
            lblPrecioPrueba2.setText("S/ 120");
        }

    }

}
