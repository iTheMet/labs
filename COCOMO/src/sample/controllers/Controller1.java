package sample.controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import  javafx.scene.control.MenuButton;
import sample.Calculations;

public class Controller1 {

    private static int teamID;
    private static int typeID;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Label KekLbl1;

    @FXML
    private MenuButton MenuTeam;

    @FXML
    private MenuItem option1;

    @FXML
    private MenuItem option2;

    @FXML
    private MenuItem option3;

    @FXML
    private Label Lbl11;

    @FXML
    private Label indicator1;

    @FXML
    private Label indicator2;

    @FXML
    private Label indicator3;

    @FXML
    private Label indicator4;

    @FXML
    private Label indicator5;

    @FXML
    private Label indicator6;

    @FXML
    private MenuButton MenuIndicator;

    @FXML
    private MenuItem PERS;

    @FXML
    private MenuItem PREX;

    @FXML
    private MenuItem RCPX;

    @FXML
    private MenuItem RUSE;

    @FXML
    private MenuItem PDIF;

    @FXML
    private MenuItem FCIL;

    @FXML
    private MenuItem SCED;

    @FXML
    private RadioButton Rbtn1;

    @FXML
    private ToggleGroup group1;

    @FXML
    private RadioButton Rbtn2;

    @FXML
    private RadioButton Rbtn3;

    @FXML
    private RadioButton Rbtn4;

    @FXML
    private RadioButton Rbtn5;

    @FXML
    private RadioButton Rbtn6;

    @FXML
    private MenuButton MenuType;

    @FXML
    private MenuItem type1;

    @FXML
    private MenuItem type2;

    @FXML
    private Label Lbl111;

    @FXML
    void initialize() {


        Btn1.setOnAction(Event->{
            indicator1.setText(String.valueOf(Calculations.EMi[0][0]));
            indicator2.setText(String.valueOf(Calculations.EMi[0][1]));
            indicator3.setText(String.valueOf(Calculations.EMi[0][2]));
            indicator4.setText(String.valueOf(Calculations.EMi[0][3]));
            indicator5.setText(String.valueOf(Calculations.EMi[0][4]));
            indicator6.setText(String.valueOf(Calculations.EMi[0][5]));


        });


       option1.setOnAction(Event -> {
           MenuTeam.setText("Распространенный");
           teamID=1;
       });
        option2.setOnAction(Event -> {
            MenuTeam.setText("Полунезависимый");
            teamID=2;
        });
        option3.setOnAction(Event -> {
            MenuTeam.setText("Встроенный");
            teamID=3;
        });

        type1.setOnAction(Event -> {
            MenuType.setText("Тип 1");
            typeID=1;
            MenuIndicator.setVisible(true);
        });
        type2.setOnAction(Event -> {
            MenuType.setText("Тип 2");
            typeID=2;
            MenuIndicator.setVisible(false);

        });

        PERS.setOnAction(Event -> {
            MenuIndicator.setText("PERS");
            indicator1.setText(String.valueOf(Calculations.EMi[0][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[0][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[0][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[0][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[0][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[0][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        PREX.setOnAction(Event -> {
            MenuIndicator.setText("PREX");

            indicator1.setText(String.valueOf(Calculations.EMi[1][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[1][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[1][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[1][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[1][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[1][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        RCPX.setOnAction(Event -> {
            MenuIndicator.setText("RCPX");

            indicator1.setText(String.valueOf(Calculations.EMi[2][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[2][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[2][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[2][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[2][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[2][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        RUSE.setOnAction(Event -> {
            MenuIndicator.setText("RUSE");

            indicator1.setText(String.valueOf(Calculations.EMi[3][0]));  Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[3][1]));  Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[3][2]));  Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[3][3]));  Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[3][4]));  Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[3][5]));  Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        PDIF.setOnAction(Event -> {
            MenuIndicator.setText("PDIF");

            indicator1.setText(String.valueOf(Calculations.EMi[4][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[4][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[4][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[4][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[4][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[4][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        FCIL.setOnAction(Event -> {
            MenuIndicator.setText("FCIL");

            indicator1.setText(String.valueOf(Calculations.EMi[5][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[5][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[5][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[5][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[5][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[5][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });
        SCED.setOnAction(Event -> {
            MenuIndicator.setText("SCED");

            indicator1.setText(String.valueOf(Calculations.EMi[6][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.EMi[6][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.EMi[6][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.EMi[6][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.EMi[6][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.EMi[6][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));
        });


        Rbtn1.setOnAction(event ->{
            KekLbl1.setText("Suka");});
        Rbtn2.setOnAction(event ->{
            KekLbl1.setText("blyat");});
        Rbtn3.setOnAction(event ->{
            KekLbl1.setText("pidr");});
        Rbtn4.setOnAction(event ->{
            KekLbl1.setText("ebanniy");});
        Rbtn5.setOnAction(event ->{
            KekLbl1.setText("govno");});
        Rbtn6.setOnAction(event ->{
            KekLbl1.setText("jopa");});




    }
}


