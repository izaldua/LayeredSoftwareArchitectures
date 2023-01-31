package ehu.eus.presentation.lab01;

import ehu.eus.bussines_logic.IdPassChecker;
import ehu.eus.bussines_logic.LenPassChecker;
import ehu.eus.bussines_logic.PassChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button;

    @FXML
    private Label outputLabel;

    @FXML
    private PasswordField passField;

    @FXML
    private Label passLabel;

    @FXML
    private TextField userField;

    @FXML
    private Label userLabel;

    private PassChecker businessLogic;

    public void setBusinessLogic(PassChecker checker) {
        businessLogic = checker;
    }

    @FXML
    void LoginBtnClick(ActionEvent event) {
        String user = userField.getText();
        String pass = passField.getText();
        if(businessLogic.checkCredentials(user, pass)){
            outputLabel.setText("Welcome " + user + "!");
            return;
        } else{
            outputLabel.setText("Wrong credentials!");
            return;
        }
    }


    @FXML
    void initialize() {
        assert button != null : "fx:id=\"button\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert outputLabel != null : "fx:id=\"outputLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert passField != null : "fx:id=\"passField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert passLabel != null : "fx:id=\"passLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert userField != null : "fx:id=\"userField\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert userLabel != null : "fx:id=\"userLabel\" was not injected: check your FXML file 'hello-view.fxml'.";
    }
}