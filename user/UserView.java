package book.system.user;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public class UserView {
    
    private UserController controllerUser;

    JPanel userPanel;

    public void userGui(JFrame tempFrame,String getName){

        controllerUser = new UserController(this);

        userPanel = new JPanel();
        userPanel.setSize(400,400);
        userPanel.setLayout(null);
        userPanel.setBackground(new Color(0,89,179));
        tempFrame.add(userPanel);

        JLabel welcomeLabel = new JLabel("WELCOME ");
        welcomeLabel.setBounds(130,30,200,30);
        welcomeLabel.setFont(new Font("Serif",  Font.BOLD, 24));
        welcomeLabel.setForeground(new Color(0,0,0));
        userPanel.add(welcomeLabel);

        JLabel NameLabel = new JLabel(getName);
        NameLabel.setBounds(100,70,300,30);
        NameLabel.setFont(new Font("Serif",  Font.BOLD, 18));
        NameLabel.setForeground(new Color(255,255,255));
        userPanel.add(NameLabel);

        JButton logoutBtn = new JButton("LOGOUT");		
        logoutBtn.setBounds(125,290,150,25);
        logoutBtn.addActionListener(controllerUser.getLogoutBtn(tempFrame));
        userPanel.add(logoutBtn);

    }

}
