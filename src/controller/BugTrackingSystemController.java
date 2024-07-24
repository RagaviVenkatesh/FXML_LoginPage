package controller;

import java.sql.SQLException;

import dao.UserDAO;
import model.User;

public class BugTrackingSystemController {
	UserDAO userDAO= new UserDAO();
	
	public boolean userValidate(User user) throws SQLException {
         boolean result = userDAO.userValidate(user);
         return result;
    }
}
