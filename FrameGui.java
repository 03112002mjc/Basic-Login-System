package book.system;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;
import book.system.register.RegisterView;



	public class FrameGui extends JFrame{
		public LoginView loginView;
		public RegisterView registerView;
		

		public FrameGui(){

				
			

			setTitle("BASIC LOGIN SYSTEM");
			setLayout(null);
			setResizable(false);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(400,400);


			registerView = new RegisterView();
			loginView = new LoginView();


			
			loginView.loginGui(this);

			setVisible(true);







		}





	}