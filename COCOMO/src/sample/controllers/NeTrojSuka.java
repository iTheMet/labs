/**
 * Sample Skeleton for 'neTrojSuka.fxml' Controller Class
 */

package sample.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import sample.Calculations;

public class NeTrojSuka {


    private static int MenuIndicatorIndex;

    @FXML
    private Button Btn1;

    @FXML
    private Button Btn2;

    @FXML
    private Label KekLbl1;

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
    private MenuItem PREC;

    @FXML
    private MenuItem FLEX;

    @FXML
    private MenuItem RESL;

    @FXML
    private MenuItem TEAM;

    @FXML
    private MenuItem PMAT;

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
    private RadioButton Rbtn6;

    @FXML
    private RadioButton Rbtn5;

    @FXML
    private Button Backward;

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {


        Btn1.setOnAction(Event->{
          Calculations.SFjsum();
        });
   Backward.setOnAction(Event-> {


               Backward.getScene().getWindow().hide();
               FXMLLoader loader = new FXMLLoader();
               loader.setLocation(getClass().getResource("/sample/view/sample.fxml"));
               try {
                   loader.load();
               } catch (IOException e) {
                   e.printStackTrace();
               }
               Parent root = loader.getRoot();
               Stage stage = new Stage();
               stage.setScene(new Scene(root));
               stage.show();
           });



        PREC.setOnAction(Event ->{
    MenuIndicator.setText("PREC"); MenuIndicatorIndex = 0;
            indicator1.setText(String.valueOf(Calculations.SFj[0][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.SFj[0][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.SFj[0][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.SFj[0][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.SFj[0][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.SFj[0][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));Rbtn4.setSelected(true);
       });
        FLEX.setOnAction(Event ->{
            MenuIndicator.setText("FLEX"); MenuIndicatorIndex = 1;Rbtn4.setSelected(true);
            indicator1.setText(String.valueOf(Calculations.SFj[1][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.SFj[1][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.SFj[1][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.SFj[1][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.SFj[1][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.SFj[1][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));Rbtn4.setSelected(true);
        });
        RESL.setOnAction(Event ->{
            MenuIndicator.setText("RESL"); MenuIndicatorIndex = 2;Rbtn4.setSelected(true);
            indicator1.setText(String.valueOf(Calculations.SFj[2][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.SFj[2][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.SFj[2][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.SFj[2][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.SFj[2][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.SFj[2][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));Rbtn4.setSelected(true);
        });
        TEAM.setOnAction(Event ->{
            MenuIndicator.setText("TEAM"); MenuIndicatorIndex = 3;Rbtn4.setSelected(true);
            indicator1.setText(String.valueOf(Calculations.SFj[3][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.SFj[3][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.SFj[3][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.SFj[3][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.SFj[3][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.SFj[3][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));Rbtn4.setSelected(true);
        });
        PMAT.setOnAction(Event ->{
            MenuIndicator.setText("PMAT"); MenuIndicatorIndex = 4;Rbtn4.setSelected(true);
            indicator1.setText(String.valueOf(Calculations.SFj[4][0])); Rbtn1.setDisable( indicator1.getText().equals("0.0"));
            indicator2.setText(String.valueOf(Calculations.SFj[4][1])); Rbtn2.setDisable( indicator2.getText().equals("0.0"));
            indicator3.setText(String.valueOf(Calculations.SFj[4][2])); Rbtn3.setDisable( indicator3.getText().equals("0.0"));
            indicator4.setText(String.valueOf(Calculations.SFj[4][3])); Rbtn4.setDisable( indicator4.getText().equals("0.0"));
            indicator5.setText(String.valueOf(Calculations.SFj[4][4])); Rbtn5.setDisable( indicator5.getText().equals("0.0"));
            indicator6.setText(String.valueOf(Calculations.SFj[4][5])); Rbtn6.setDisable( indicator6.getText().equals("0.0"));Rbtn4.setSelected(true);
        });

        Rbtn1.setOnAction(event ->{
            KekLbl1.setText("Suka");
            Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator1.getText()) ;
        });
        Rbtn2.setOnAction(event ->{
            KekLbl1.setText("blyat");});
        Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator2.getText()) ;
        Rbtn3.setOnAction(event ->{
            KekLbl1.setText("pidr");
            Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator3.getText()) ;

        });
        Rbtn4.setOnAction(event ->{
            KekLbl1.setText("ebanniy");
            Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator4.getText()) ;});
        Rbtn5.setOnAction(event ->{
            KekLbl1.setText("govno");Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator5.getText()) ;});
        Rbtn6.setOnAction(event ->{
            KekLbl1.setText("jopa");Calculations.SFjChosen[MenuIndicatorIndex] =  Double.parseDouble(indicator6.getText()) ;});


    }}