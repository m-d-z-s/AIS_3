package me.mdzs.ais3.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import me.mdzs.ais3.domain.InvalidConditionException;
import me.mdzs.ais3.domain.Solver;
import me.mdzs.ais3.domain.UserInput;

import java.util.List;

public class Controller {
    @FXML
    private CheckBox petIsNervous;
    @FXML
    private CheckBox furnitureSways;
    @FXML
    private CheckBox windowsRattling;
    @FXML
    private CheckBox waterSpillsOut;
    @FXML
    private CheckBox bricksCrack;
    @FXML
    private CheckBox furnitureMoves;
    @FXML
    private CheckBox windowsBurst;
    @FXML
    private CheckBox bigWavesOnWater;
    @FXML
    private CheckBox brickWallsFall;
    @FXML
    private CheckBox treeBranchesFall;
    @FXML
    private CheckBox hugeStructuralDamage;
    @FXML
    private CheckBox cracksInTheGround;
    @FXML
    private CheckBox bridgesCollapse;
    @FXML
    private CheckBox railwayTracksBend;
    @FXML
    private CheckBox curvatureOfTheHorizon;
    @FXML
    private CheckBox objectsThrownUpInAir;
    @FXML
    private Button result;
    @FXML
    private Label textResult;


    @FXML
    protected void getResult(ActionEvent event) {
        List<Boolean> inputList = List.of(petIsNervous.isSelected(), furnitureSways.isSelected(),
                windowsRattling.isSelected(), waterSpillsOut.isSelected(), bricksCrack.isSelected(),
                furnitureMoves.isSelected(), windowsBurst.isSelected(), bigWavesOnWater.isSelected(),
                brickWallsFall.isSelected(), treeBranchesFall.isSelected(), hugeStructuralDamage.isSelected(),
                cracksInTheGround.isSelected(), bridgesCollapse.isSelected(), railwayTracksBend.isSelected(),
                curvatureOfTheHorizon.isSelected(), objectsThrownUpInAir.isSelected());
        UserInput userInput = new UserInput(inputList);

        Solver solver = new Solver(userInput);
        String result = "";
        try {
            result = solver.calculate();
        } catch (InvalidConditionException exception) {
            result = "error";
        }

        textResult.setText(result);

    }
}