package client;

import controller.ControllerTabuleiro;

public class DeserializeData {
	public static void updateDate(String Data){
			String master = "master";
			//setting up the first client to login in as master
			if(Data.compareTo(master) == 0){
				System.out.println("Setting master . . .");
				ControllerTabuleiro.setMaster();
			}
	}
}
