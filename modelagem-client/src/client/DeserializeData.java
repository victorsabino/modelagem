package client;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerTabuleiro;

public class DeserializeData {
	public static void updateDate(String Data){
			//setting up the first client to login in as master
			if(Data.compareTo("master") == 0){
				System.out.println("Setting master . . .");
				ControllerTabuleiro.setMaster();
			}
			else if(Data.contains("selectPlayer")){
				String nome = Data.substring(Data.lastIndexOf(":") + 1);
				System.out.println("Data recieved " + nome);
					for (view.Exercito ex : view.Configuracao.getInstance().getLstexercitos()) {
						System.out.println(ex.getNome());
						if(ex.getNome().compareTo(nome) == 0 && ex.isSelecionado() != true){
							ex.setSelecionado();
							//ControllerTabuleiro.getInstance().notificaMudancas();
						}
					}
				}
			}
	}
