package com.teste.ws;

import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

public class TestaWS {

	public static void main(String[] args) throws Exception {
		
		ClientRequest request = new ClientRequest("http://localhost:8080/ws-teste-app/helloWorld");
		
		request.accept("application/json");
		
		ClientResponse<String> resp = request.get(String.class);
		
		int respCode = resp.getResponseStatus().getStatusCode();
		if(respCode != 200){
			throw new RuntimeException("Moio");
		}
		
		String respostaTratada = resp.getEntity();
		
		System.out.println(respostaTratada);
		
	}

}
