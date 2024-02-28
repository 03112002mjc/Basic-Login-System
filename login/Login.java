package book.system.login;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;









public class Login{


	public String LoginFileHandling(String getUsername, String getPassword){
		try(BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\MARC JOSEPH\\Desktop\\Book System\\database\\user.dat"))){

		
			String line;

			while((line = reader.readLine()) != null){
				String[] parts = line.split(", ");

					String name = parts[0];
					String username = parts[1];
					String password = parts[2];
					


					if (getUsername.equals(username) && getPassword.equals(password)){
						return name;

					}


				}



			





		}
		catch (IOException e){
			e.printStackTrace();
			
		}


		return null;


	}












}

