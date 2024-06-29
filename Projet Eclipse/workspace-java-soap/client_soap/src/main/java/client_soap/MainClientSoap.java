package client_soap;

import java.util.List;

import server_soap.BanqueServiceService;
import server_soap.BanqueWS;
import server_soap.Compte;

public class MainClientSoap {

	public static void main(String[] args) {
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort();

		long l_long_generatedAccount = stub.createAccount(500);
		
		System.out.println(l_long_generatedAccount);
		
		List<Compte> comptes = stub.getComptes();
		
		for(Compte l_ref_compte : comptes) {
			System.out.println("Code : " + l_ref_compte.getCode() + " / Solde : "+ l_ref_compte.getSolde());
		}
	}

}
