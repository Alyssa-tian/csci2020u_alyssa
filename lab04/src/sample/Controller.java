package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML private Text actiontarget;
    @FXML private Text actiontarget2;
    @FXML private Text actiontarget3;
    @FXML private Text actiontarget4;
    @FXML private Text actiontarget5;
    @FXML private Text actiontarget6;

    @FXML private TextField UserInput;
    @FXML private TextField passwordField;
    @FXML private TextField NameInput;
    @FXML private TextField EmailInput;
    @FXML private TextField PhoneInput;
    @FXML private TextField DoBInput;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        System.out.println("Click");
        //actiontarget.setText("Register button pressed");
        print();
    }

    @FXML
    private void print(){
        actiontarget.setText(UserInput.getText());
        actiontarget2.setText(passwordField.getText());
        actiontarget3.setText(NameInput.getText());
        actiontarget4.setText(EmailInput.getText());
        actiontarget5.setText(PhoneInput.getText());
        actiontarget6.setText(DoBInput.getText());

    }
}
