package book.system.user;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import book.system.login.LoginView;


public class UserController {

    private UserView userView;
    public LoginView loginView;

        public UserController(UserView userView){
            this.userView = userView;
            loginView = new LoginView();

        }

    public ActionListener getLogoutBtn(JFrame tempFrame){
        return new ActionListener(){

            public void actionPerformed(ActionEvent e){

                tempFrame.getContentPane().removeAll();
                tempFrame.repaint();
                loginView.loginGui(tempFrame);
                JOptionPane.showMessageDialog(null,"logout successfully!");
            }
        };
    }
}
