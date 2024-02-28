package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;




	public class RegisterView {
		
		JPanel registerPanel;
		public RegisterController rController;



		public void registerGui(JFrame tempFrame){

			rController = new RegisterController(this);

			registerPanel = new JPanel();

			registerPanel.setSize(400,400);
			registerPanel.setLayout(null);
			registerPanel.setBackground(new Color(0,204,0));

			tempFrame.add(registerPanel);	

			

			JLabel registerLabel = new JLabel("REGISTER");
        	registerLabel.setBounds(130,30,150,30);
        	registerLabel.setFont(new Font("Serif",  Font.BOLD, 24));
        	registerLabel.setForeground(new Color(255,255,255));
        	registerPanel.add(registerLabel);


			






			








			JLabel registerNameLabel = new JLabel(" Name: ");
			registerNameLabel.setBounds(50,100,50,20);
			registerNameLabel.setForeground(new Color(255,255,255));
			registerPanel.add(registerNameLabel);




			TextField registerNameText = new TextField();
			registerNameText.setBounds(100,100,200,20);
			registerPanel.add(registerNameText);
			










			JLabel registerUsernameLabel = new JLabel("Username: ");
			registerUsernameLabel.setBounds(20,150,70,20);
			registerUsernameLabel.setForeground(new Color(255,255,255));
			registerPanel.add(registerUsernameLabel);



			TextField registerUsernameText = new TextField();
			registerUsernameText.setBounds(100,150,200,20);
			registerPanel.add(registerUsernameText);
		








			JLabel registerPasswordLabel = new JLabel("Password: ");
			registerPasswordLabel.setBounds(20,200,70,20);
			registerPasswordLabel.setForeground(new Color(255,255,255));
			registerPanel.add(registerPasswordLabel);


			TextField registerPasswordText = new TextField();
			registerPasswordText.setBounds(100,200,200,20);
			registerPanel.add(registerPasswordText);

		


			


















			JButton registerBtn = new JButton("Register");
			registerBtn.setBounds(260,300,90,25);

			registerBtn.addActionListener(rController.getRegisterBtn(tempFrame,registerNameText,registerUsernameText,registerPasswordText));

			registerPanel.add(registerBtn);








			JButton cancelBtn = new JButton("Cancel");
			cancelBtn.setBounds(150,300,90,25);

			cancelBtn.addActionListener(rController.getCancelBtn(tempFrame));

			registerPanel.add(cancelBtn);

		}
			


		



	





	}		