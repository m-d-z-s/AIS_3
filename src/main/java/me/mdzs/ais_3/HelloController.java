package me.mdzs.ais_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private CheckBox A1;
    @FXML
    private CheckBox A3;
    @FXML
    private CheckBox A4;
    @FXML
    private CheckBox A6_1;
    @FXML
    private CheckBox A6_2;
    @FXML
    private CheckBox A6_3;
    @FXML
    private CheckBox A5;
    @FXML
    private CheckBox A9_1;
    @FXML
    private CheckBox A9_2;
    @FXML
    private CheckBox A8_1;
    @FXML
    private CheckBox A8_2;
    @FXML
    private CheckBox A7;
    @FXML
    private CheckBox A10;
    @FXML
    private CheckBox A11;
    @FXML
    private CheckBox A12_1;
    @FXML
    private CheckBox A12_2;
    @FXML
    private Button result;
    @FXML
    private Label textResult;


    @FXML
    protected void getResult(ActionEvent event) {
        boolean getA1 = A1.isSelected();
        boolean getA3 = A3.isSelected();
        boolean getA4 = A4.isSelected();
        boolean getA6_1 = A6_1.isSelected();
        boolean getA6_2 = A6_2.isSelected();
        boolean getA6_3 = A6_3.isSelected();
        boolean getA5 = A5.isSelected();
        boolean getA9_1 = A9_1.isSelected();
        boolean getA9_2 = A9_2.isSelected();
        boolean getA8_1 = A8_1.isSelected();
        boolean getA8_2 = A8_2.isSelected();
        boolean getA7 = A7.isSelected();
        boolean getA10 = A10.isSelected();
        boolean getA11 = A11.isSelected();
        boolean getA12_1 = A12_1.isSelected();
        boolean getA12_2 = A12_2.isSelected();

        Earthquake earthquake = new Earthquake(getA1, getA3, getA4, getA6_1, getA6_2, getA6_3, getA5, getA9_1,
                getA9_2, getA8_1, getA8_2, getA7, getA10, getA11, getA12_1, getA12_2);
        String res = earthquake.resultOfDegree();
        if (res == "") res = "error";
        textResult.setText(res);

    }
}