package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import book.system.login.LoginView;







 public class RegisterController{

 	public RegisterView registerView;
 	public Register register = new Register();
 	public LoginView loginView;

 	 RegisterController(RegisterView registerView){
 	 	this.registerView = registerView;
 	 	loginView = new LoginView();
 	 	

 	 }





 	 public ActionListener getRegisterBtn(JFrame tempFrame,TextField name,TextField username,TextField password){
 	 	return new ActionListener(){

 	 		public void actionPerformed(ActionEvent e){
 	 			String getName = name.getText();
 	 			String getUsername = username.getText();
 	 			String getPassword = password.getText();


 	 			if (getName.isEmpty() || getUsername.isEmpty() || getPassword.isEmpty()){
 	 				JOptionPane.showMessageDialog(null, "Fill up all before registering");

 	 			}




 	 			else{


 	 			register.RegisterFileHandling(getName,getUsername,getPassword);
                  

 	 			
 	 			tempFrame.getContentPane().removeAll();
 	 			tempFrame.repaint();	
 	 			loginView.loginGui(tempFrame);


									}

 	 			




 	 			
 	 		}






 	 	};

 	 	
 	 }















 	 public ActionListener getCancelBtn(JFrame tempFrame){
 	 	return new ActionListener(){

 	 		public void actionPerformed(ActionEvent e){


 	 			tempFrame.getContentPane().removeAll();
 	 			tempFrame.repaint();
 	 			loginView.loginGui(tempFrame);



 	 		}





 	 	};
 	 }








 }