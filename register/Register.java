package book.system.register;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;






	class Register{

		public void RegisterFileHandling(String name, String username, String password){

			String dir = "C:\\Users\\MARC JOSEPH\\Desktop\\Book System\\database";


			try(BufferedWriter writer = new BufferedWriter(new FileWriter(dir + "\\user.dat",true))){
			
			writer.write(name + ", " + username + ", " + password);
			writer.newLine();
			JOptionPane.showMessageDialog(null, "Registration successful!");






			}catch(IOException e){
				e.printStackTrace();
			}





		}










	}
