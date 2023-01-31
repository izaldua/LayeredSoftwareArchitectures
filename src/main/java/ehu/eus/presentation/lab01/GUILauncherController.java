package ehu.eus.presentation.lab01;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import ehu.eus.bussines_logic.PassChecker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GUILauncherController {

    private LoginController loginController;

    private Parent loginUI;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea chooseField;

    @FXML
    private TextField classNameField;

    @FXML
    private Button interfaceBttn;

    @FXML
    private Button runBttn;

    @FXML
    void runUIclick(ActionEvent event) {

    }

    @FXML
    void setBLclick(ActionEvent event) {
        try {
            PassChecker bizlog = (PassChecker)
                    Class.forName(bizlogInput.getText()).newInstance();
            loginController.setBusinessLogic(bizlog);
            textarea.setText("Now " + bizlogInput.getText() +
                    " is operating");
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }

    @FXML
    void initialize() throws IOException {
        assert chooseField != null : "fx:id=\"chooseField\" was not injected: check your FXML file 'GUILauncher.fxml'.";
        assert classNameField != null : "fx:id=\"classNameField\" was not injected: check your FXML file 'GUILauncher.fxml'.";
        assert interfaceBttn != null : "fx:id=\"interfaceBttn\" was not injected: check your FXML file 'GUILauncher.fxml'.";
        assert runBttn != null : "fx:id=\"runBttn\" was not injected: check your FXML file 'GUILauncher.fxml'.";
        FXMLLoader loaderMain = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        loginUI = loaderMain.load();
        loginController = loaderMain.getController();
    }
}
