package com.example.demojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class HelloController {
    @FXML
    private TextField equipoLocal;
    @FXML
    private TextField equipoVisitante;
    @FXML
    private TextField golesLocal;
    @FXML
    private TextField golesVisitante;
    @FXML
    private Label enviaResultado;

    @FXML
    protected void onButtonClick(){
        String local = equipoLocal.getText();
        String visitante = equipoVisitante.getText();

        int golesL = Integer.parseInt(golesLocal.getText());
        int golesV = Integer.parseInt(golesVisitante.getText());

        if (golesL > golesV) {
            enviaResultado.setText(local + " ha ganado a " + visitante);
        }
        else if (golesV > golesL) {
            enviaResultado.setText(visitante + " ha ganado a " + local);
        }
        else {
            enviaResultado.setText(local + " ha empatado contra " + visitante);
        }
    }
}
