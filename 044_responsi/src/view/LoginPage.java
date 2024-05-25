package view;

import controller.LoginController;

import java.awt.event.ActionListener;


public class LoginPage {
    private usernameField;
    private passwordField;
    private loginButton;
    private LoginController loginController;
    
public LoginPage {
    this.loginController = controller;
    setTitle("Login");
    setSize(300,150);
    setLocationRelativeTo(null);
    
    usernameField = ();
    panel.add(usernameField);
    
    panel.add("password:"));
    passwordField();
    panel.add(passwordField);
    
    LoginButton = ("login");
    panel.add(loginbutton);
    
    add(panel);
    
    loginButton.addActionListener(new ActionListener){
    public void actionPerformed(ActionEvent e){
        loginController.login(usernameField.getText(),new String(passwordField.getPassword()));
    }
  });
}
    
  public void showErrorMessage(string message){  
}
    
}
