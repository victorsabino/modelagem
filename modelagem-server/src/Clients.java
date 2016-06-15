import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class Clients implements Runnable{
	private ArrayList<Socket> lstClient = new ArrayList<Socket>();
	private Socket client;
	
	public Clients(Socket client, ArrayList <Socket> lstClient){
		this.lstClient = lstClient;
		this.client = client;
	}
	public void addClient(Socket client, int qtd){
		lstClient.add(qtd, client);
		
	}
	@Override
	public void run() {
		System.out.println("Nova conexão com o cliente " + client.getInetAddress().getHostAddress());
		try {
			Scanner in = new Scanner(client.getInputStream());
			while(in.hasNextLine()){
				sendMessage(in.nextLine());
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	void sendMessage(String msg) throws IOException{
		System.out.println("Trying to send msg");
		for (Socket c: lstClient) {
			if(c != client){
				PrintStream p = new PrintStream(c.getOutputStream());
				p.println("Cliente " + "1" +":" + msg);
				System.out.println("Cliente " + "1" +":" + msg);
			}
		}
	}
}
