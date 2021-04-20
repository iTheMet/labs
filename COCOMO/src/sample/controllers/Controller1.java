package sample.controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import  javafx.scene.control.MenuButton;

public class Controller1 {
    @FXML
private ResourceBundle resources;

    @FXML
    private URL location;

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
    private Button Btn1;

    @FXML
    private Button Btn2;
    @FXML
    private MenuItem option1;

    @FXML
    private MenuItem option2;

    @FXML
    private MenuItem option3;

    @FXML
    private Label KekLbl1;
    @FXML
    private MenuButton MenuTeam;

    @FXML
    void initialize() {
       option1.setOnAction(Event -> {
           MenuTeam.setText("Распространенный");
       });
        option2.setOnAction(Event -> {
            MenuTeam.setText("Полунезависимый");
        });
        option3.setOnAction(Event -> {
            MenuTeam.setText("Встроенный");
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


