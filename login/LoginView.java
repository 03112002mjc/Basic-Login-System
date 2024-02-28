package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




	public class LoginView {
		
		public LoginController Lcontroller;
        JPanel panelLogin;
		TextField loginUsernameText = new TextField();



		public void loginGui(JFrame tempFrame){

			Lcontroller = new LoginController(this);
			panelLogin = new JPanel();

			panelLogin.setSize(400,400);
			panelLogin.setLayout(null);
			panelLogin.setBackground(new Color(255,255,255));

			tempFrame.add(panelLogin);	

			




			

			JButton loginRegisterBtn = new JButton("REGISTER");
			
            loginRegisterBtn.setBounds(125,290,150,25);
            loginRegisterBtn.setBackground(new Color(0,204,0));
            loginRegisterBtn.setForeground(new Color(255,255,255));

			loginRegisterBtn.addActionListener(Lcontroller.getRegisterBtn(tempFrame));

			panelLogin.add(loginRegisterBtn);







            JLabel loginLabel = new JLabel("LOGIN");
            loginLabel.setBounds(150,30,100,30);
            loginLabel.setFont(new Font("Serif",  Font.BOLD, 24));
            loginLabel.setForeground(new Color(0,0,0));
            panelLogin.add(loginLabel);



			JLabel loginUsernameLabel = new JLabel("Username");
			loginUsernameLabel.setBounds(50,100,100,30);
            loginUsernameLabel.setForeground(new Color(0,0,0));
			panelLogin.add(loginUsernameLabel);





			TextField loginUsernameText = new TextField();
			loginUsernameText.setBounds(50,135,300,30);
			panelLogin.add(loginUsernameText);






			JLabel loginPasswordLabel = new JLabel("Password");
			loginPasswordLabel.setBounds(50,170,100,30);
            loginPasswordLabel.setForeground(new Color(0,0,0));
			panelLogin.add(loginPasswordLabel);




			TextField loginPasswordText = new TextField();
			loginPasswordText.setBounds(50,205,300,30);
			panelLogin.add(loginPasswordText);






			JButton loginBtn = new JButton("LOGIN");
			loginBtn.setBounds(125,250,150,25);
            loginBtn.setBackground(new Color(0,89,179));
            loginBtn.setForeground(new Color(255,255,255));

			loginBtn.addActionListener(Lcontroller.getLoginBtn(tempFrame,loginUsernameText,loginPasswordText));

			panelLogin.add(loginBtn);








		}
			







	





	}		 
    









