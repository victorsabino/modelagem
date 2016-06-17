package client;

import java.util.ArrayList;
import java.util.List;

import controller.ControllerTabuleiro;
import view.Configuracao;

public class DeserializeData {
	public static void updateDate(String Data){
			//setting up the first client to login in as master
			ControllerTabuleiro tabuleiro = ControllerTabuleiro.getInstance();
			if(Data.compareTo("master") == 0){
				System.out.println("Setting master . . .");
				tabuleiro.setMaster();
			}
			else if(Data.compareTo("init") == 0){
				// Abre o tabuleiro
				Configuracao.getInstance().initGame();
			}
			else if(Data.contains("selectPlayer")){
				String nome = Data.substring(Data.lastIndexOf(":") + 1);
					for (view.Exercito ex : view.Configuracao.getInstance().getLstexercitos()) {
						System.out.println("Comparando ex atual " + ex.getNome() + " com o valor recebido " + nome);
						if(ex.getNome().compareTo(nome) == 0 && ex.isSelecionado() != true){
							System.out.println("Selecionando bonecos");
							ex.setSelecionado();
							//tabuleiro.getInstance().notificaMudancas();
						}
					}
				}
			}
	}
