package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.register.RegisterView;
import book.system.user.UserView;



public class LoginController{

		public RegisterView registerView = new RegisterView();
		public UserView userView = new UserView();
		private LoginView loginView;
		private Login login;

		public LoginController(LoginView loginView){

			this.loginView = loginView;
			this.login = new Login();


			

		}



	public ActionListener getRegisterBtn(JFrame registerFrame){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){

				registerFrame.getContentPane().removeAll();
				registerFrame.repaint();
				registerView.registerGui(registerFrame);

				
				

			}



			
		};

	}




	public ActionListener getLoginBtn(JFrame tempFrame, TextField username, TextField password){
		return new ActionListener(){
			public void actionPerformed(ActionEvent e){

				String getUsername = username.getText();
				String getPassword = password.getText();


				if(getUsername.isEmpty() || getPassword.isEmpty()){
					JOptionPane.showMessageDialog(null,"Please Fill up all Before Login");

				}else{

				String displayName = login.LoginFileHandling(getUsername,getPassword);



				if (displayName != null){
					
					
					tempFrame.getContentPane().removeAll();
 	 			    tempFrame.repaint();	
 	 			    userView.userGui(tempFrame,displayName);

				}
					
			


				else{
					JOptionPane.showMessageDialog(null,"Incorrect Password or Username!");

				}



				

				}



			
		}

	};
	}
	
}