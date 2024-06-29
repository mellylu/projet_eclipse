package server_soap;

import jakarta.xml.ws.Endpoint;

public class MainServerSoap {

	public static void main(String[] args) {
		String url = "http://localhost:8585/";
		
		Endpoint.publish(url, new BanqueService());
		
		System.out.println(url);
	}

}
