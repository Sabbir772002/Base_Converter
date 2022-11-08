package com.example.ct_1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Button b1;

    @FXML
    private Button hbutton;

    @FXML
    private TextArea t1;

    @FXML
    private TextField t2;
    @FXML
    void nc(ActionEvent e) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(nextcontrollere.class.getResource("next.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 400, 460);
            ((Node) e.getSource()).getScene().getWindow().hide();
            Stage stage= new Stage();
            stage.setTitle("Hello!");
            stage.setScene(scene);
            stage.show();
        }catch (Exception ei){

        }

    }

    @FXML
    void bclick(ActionEvent event) {
        String n=t1.getText();
       String s= base(n,2);
       t2.setText(s);

    }

    @FXML
    void cclick(ActionEvent event) {
       t1.setText("Not a number");
       t2.setText("No Input");
     //  t1.editableProperty(true);

    }

    @FXML
    void eclick(ActionEvent event) {
      Platform.exit();

    }

    @FXML
    void hclick(ActionEvent event) {
        String n=t1.getText();
        String s= base(n,16);
        t2.setText(s);
    }

    @FXML
    void oclick(ActionEvent event) {
        String n=t1.getText();
        String s= base(n,8);
        t2.setText(s);

    }

    String base(String number, int dbase){
        if(isnumeric(number)){
            return Integer.toString(
                    Integer.parseInt(number,10),dbase);


        }
        return "Not a number";

    }
    public static boolean isnumeric(String num){
        if(num==null){
            return false;
        }try {
         double d = Double.parseDouble(num);


        }catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

}