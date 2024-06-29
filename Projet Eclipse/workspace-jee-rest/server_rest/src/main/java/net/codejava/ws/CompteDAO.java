package net.codejava.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompteDAO {
	// On va créer une variable compatible avec le système multi thread
	private static long m_long_dernierNumeroCompte = 0;
	
	// On crée une liste de stockage pour tous les comptes (dans la mémoire)
	private ArrayList<Compte> m_ArrayList_listeComptes = null;
	
	// Utilisation du design pattern Singleton
	private static CompteDAO instance = null;
	
	private CompteDAO() {
		// On initialise la liste des comptes 
		m_ArrayList_listeComptes = new ArrayList<Compte>();
	}
	
	// Constructeur pour le CompteDAO
	public static CompteDAO getInstance() {
		if (instance==null) {
			instance = new CompteDAO();
		}
		
		return instance;
	}
	
	// Methode DAO pour créer un compte
	// On se positionne dans le mode synchronized pour ne pas avoir des doublons dans les numéros de compte
	synchronized public long createAccount(double i_dbl_soldeInitial) {
		// Attention, on doit générer un nouveau numéro de compte absolument unique !
		// On a besoin d'un nouveau numéro de compte
		m_long_dernierNumeroCompte++;
			
		// On crée une instance de compte en mémoire
		Compte l_Compte_elementGenere = new Compte(
				/* LONG NUMERO DU COMPTE 	*/ m_long_dernierNumeroCompte, 
				/* DBL SOLDE DU COMPTE		*/ i_dbl_soldeInitial, 
				/* DATE DE CREATION COMPTE	*/ new Date()
				);
		
		// On mémorise le compte dans la liste
		get_ArrayList_stockageCompte().add(l_Compte_elementGenere);
		
		// On prépare la valeur en sortie (numéro de compte) qui correspond au dernier élément inséré
		long o_long_numeroDeCompte = l_Compte_elementGenere.getCode();

		// On retourne le numéro de compte
		return o_long_numeroDeCompte;
	}
	
	// Methode pour récupérer le solde d'un compte
	public double getSolde(long i_long_code) throws Exception {
		// On récupère en premier lieu le compte
		Compte l_ref_Compte = getCompte(i_long_code);
		
		// On récupère le solde du compte
		double o_dbl_solde = l_ref_Compte.getSolde();
		
		// On retourne le solde du compte
		return o_dbl_solde;
	}
	
	// Methode pour récupérer un seul compte
	public Compte getCompte(long i_long_codeRecherche) throws Exception {	
		// On déclare la variable en sortie initialement à null
		Compte o_Compte_compte = null;
		
		// On parcourant toute la liste manuellement pour le moment
		for (Compte l_Compte_elementParcouru : get_ArrayList_stockageCompte()) {		
			// On récupère le code du compte parcouru dans la liste
			long l_long_codeElementParcouru = l_Compte_elementParcouru.getCode();
			
			// Si le code est exactement celui recherché
			if (l_long_codeElementParcouru==i_long_codeRecherche) {
				// On mémorise dans la variable en sortie
				o_Compte_compte = l_Compte_elementParcouru;
				
				// On demande d'arrêter la boucle car on a trouvé l'élément recherché
				break;
			}			
		}
		
		// Si on n'a trouvé aucun élément on lance une exception 
		if (o_Compte_compte==null) {
			throw new Exception("This account code has not been found : " + i_long_codeRecherche);
		}
		
		// Si on arrive ici, on retourne le compte trouvé
		return o_Compte_compte;
	}
	
	synchronized public void updateCompte(
			/* LONG CODE COMPTE A MODIFIER 	*/ long 	i_long_code,
			/* DBL NOUVEAU SOLDE			*/ double 	i_double_nouveauSolde
			) throws Exception {
		// On récupère le compte
		Compte l_ref_compte = getCompte(i_long_code);
		
		l_ref_compte.setSolde(i_double_nouveauSolde);
	}
	
	public void deleteCompte(
			/* LONG CODE COMPTE A MODIFIER 	*/ long i_long_code
			) throws Exception {
		// On déclare un itérateur
		int l_int_iterateur = 0;
		
		// On récupère la référence vers la liste
		ArrayList<Compte> l_ref_ALIST_comptes = get_ArrayList_stockageCompte();
		
		// On déclare la variable qui mémorise la référence vers l'élément parcouru (initialement à null)
		boolean l_bool_compteTrouve = false;
		
		// On parcourant toute la liste manuellement pour le moment
		for (l_int_iterateur=0;l_int_iterateur<l_ref_ALIST_comptes.size();l_int_iterateur++) {	
			// On récupère l'élément à l'indice demandé
			Compte l_Compte_elementParcouru = l_ref_ALIST_comptes.get(l_int_iterateur);
			
			// On récupère le code du compte parcouru dans la liste
			long l_long_codeElementParcouru = l_Compte_elementParcouru.getCode();
			
			// Si le code est exactement celui recherché
			if (l_long_codeElementParcouru==i_long_code) {
				// On retire l'élément pointé par l'itérateur
				l_ref_ALIST_comptes.remove(l_int_iterateur);
				
				// On positionne le flag qui indique qu'on a bien trouvé le compte
				l_bool_compteTrouve = true;
				
				// On demande d'arrêter la boucle car on a trouvé l'élément recherché
				break;
			}			
		}
		
		// Si on n'a trouvé aucun élément on lance une exception 
		if (l_bool_compteTrouve==false) {
			throw new Exception("This account code has not been found : " + i_long_code);
		}
	}
	
	public void deleteAllAccounts() throws Exception {
		for (Compte l_ref_compte : get_ArrayList_stockageCompte()) {
				long l_long_code = l_ref_compte.getCode();
				
				deleteCompte(l_long_code);
		}	
	}
	
	// Methode pour récupérer les comptes
	public List<Compte> getComptes() {
		// On retourne directement la liste de stockage des comptes
		return get_ArrayList_stockageCompte();
	}
	
	// Methode interne au programme pour récupérer la liste des comptes
	private ArrayList<Compte> get_ArrayList_stockageCompte() {
		return m_ArrayList_listeComptes;
	}
}
