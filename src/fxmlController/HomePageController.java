package fxmlController;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import controller.BugTrackingSystemController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.User;

public class HomePageController implements Initializable{
	
	BugTrackingSystemController con = new BugTrackingSystemController();
	
	Alert alert;
	
	@FXML
    private Button login;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

   
    public void login() throws SQLException {
    	System.out.println(username.getText());
    	boolean result = con.userValidate(new User(0,username.getText(), password.getText()));
    	
    	if(result == true)
    	{
    		alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText(null);
    		alert.setContentText("Login Successful!");
    		alert.showAndWait();
    		
    		login.getScene().getWindow().hide();
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
