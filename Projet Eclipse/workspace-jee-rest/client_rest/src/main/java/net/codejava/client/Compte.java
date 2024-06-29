package net.codejava.client;

import java.util.Date;
import java.util.Objects;

public class Compte {
	// Déclarations des variables membres
	private long 	m_long_code;
	private double 	m_dbl_solde;

	// Attention, on utilise la Date depuis le package Java.util
	private Date m_Date_datecreation;

	// Constructeur sans paramètre
	public Compte() {
		super();
	}

	// Constructeur avec paramètres
	public Compte(
			/* LONG NUMERO DU COMPTE 	*/ long 	i_long_code, 
			/* DBL SOLDE DU COMPTE		*/ double 	i_dbl_solde, 
			/* DATE DE CREATION COMPTE	*/ Date 	i_Date_datecreation
			) {
		super();

		setCode(i_long_code);
		setSolde(i_dbl_solde);
		setDateCreation(i_Date_datecreation);
	}

	// GETTERS
	public long 	getCode() 		{return m_long_code;}
	public double 	getSolde() 		{return m_dbl_solde;}
	public Date 	getDateCreation() {return m_Date_datecreation;}

	// SETTERS
	private void setCode			(Long 	i_long_code) 			{this.m_long_code 			= i_long_code;}
	public 	void setSolde			(double i_dbl_solde) 			{this.m_dbl_solde 			= i_dbl_solde;}
	private void setDateCreation	(Date 	i_Date_datecreation) 	{this.m_Date_datecreation 	= i_Date_datecreation;}

	@Override
	public int hashCode() {
		return Objects.hash(m_long_code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Compte other = (Compte) obj;
		return m_long_code == other.m_long_code;
	}
	
	@Override public String toString() {
		String o_str = ""
				+ "CODE : " + getCode() + "\n" 
				+ "SOLDE : " + getSolde() + "\n"
				+ "DATE CREATION : " + getDateCreation();
		
		return o_str;
	}
}
