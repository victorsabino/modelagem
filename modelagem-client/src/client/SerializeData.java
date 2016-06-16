package client;

public class SerializeData {
	private static SerializeData instance = null;
	
	public static SerializeData getInstance(){
		if(instance == null){
			instance = new SerializeData();
		}
		return instance;
	}
	
	public void sendData(String type, String v1){
		String seriealizedString = null;
		if(type.compareTo("selectPlayer") == 0){
			String name = v1;
			Client.setMessage(seriealizedString);
		}
	}
	public void sendData(String type, String v1, String v2){
			
	}
	public void sendData(String type, String v1, String v2, String v3){
		
	}
}
