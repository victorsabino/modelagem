package client;

public class SerializeData {
	private static SerializeData instance = null;
	
	public static SerializeData getInstance(){
		if(instance == null){
			instance = new SerializeData();
		}
		return instance;
	}
	
	public void sendData(String type){
		if(type.compareTo("init") == 0){
			Client.setMessage(type);
		}
	}

	public void sendData(String type, String v1){
		String seriealizedString = null;
		System.out.println("Distribuindo");
		if(type.compareTo("selectPlayer") == 0){
			String name = v1;
			seriealizedString = "selectPlayer:" + name;
			Client.setMessage(seriealizedString);
		}
		else if (type.compareTo("Distribuir") == 0){
			String cor = v1;
			seriealizedString = "Distribuir:" + cor;
			Client.setMessage(seriealizedString);
		}
	}
	public void sendData(String type, String v1, String v2, String v3, String v4, String v5, String v6){
		String seriealizedString = null;
		if(type.compareTo("Atacar") == 0){
			System.out.println("Atacando");
			String name1 = v1;
			String cor1 = v2;
			String numeroSoldados1 = v3;
			String name2 = v4;
			String cor2 = v5;
			String numeroSoldados2 = v6;
			seriealizedString = "Atacar:" + name1 + "," + cor1 + "," + numeroSoldados1 + "," + name2 + "," + cor2 + "," + numeroSoldados2;
			Client.setMessage(seriealizedString);
		}
		else if(type.compareTo("Remanejar") == 0){
			System.out.println("Remanejando");
			String name1 = v1;
			String cor1 = v2;
			String numeroSoldados1 = v3;
			String name2 = v4;
			String cor2 = v5;
			String numeroSoldados2 = v6;
			seriealizedString = "Remanejar:" + name1 + "," + cor1 + "," + numeroSoldados1 + "," + name2 + "," + cor2 + "," + numeroSoldados2;
			Client.setMessage(seriealizedString);
		}
	}
	public void sendData(String type, String v1, String v2, String v3){
		
	}
}
