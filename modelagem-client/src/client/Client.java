package client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client implements Runnable{
	int port = 123;
	DeserializeData deserialize = new DeserializeData();
		@Override
		public void run() {
			try{
				System.out.println("Cliente");
				Socket cli = new Socket("127.0.0.1", port);
				ServerData msg_sv = new ServerData(cli);
				Thread t = new Thread (msg_sv);
				t.start();
				System.out.println("O cliente se conectou ao servidor!");
				Scanner teclado = new Scanner(System.in);
				PrintStream saida = new PrintStream(cli.getOutputStream());
				String msg = teclado.nextLine();
				while (msg.compareTo("###")!=0) {
					saida.println(msg);
					deserialize.updateDate(msg);
					msg = teclado.nextLine();
				}
				saida.close();
				teclado.close();
				cli.close();
				System.out.println("O cliente terminou de executar!");
			}
			catch(Exception e){
				
			}
		}
}
