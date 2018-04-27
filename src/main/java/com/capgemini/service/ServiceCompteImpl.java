package com.capgemini.service;

import java.util.List;

import com.capgemini.dao.IDaoCompte;
import com.capgemini.entity.Compte;

/*
 * classe d'implémentation du service
 * qui ne fonctionne qu'avec un composant dao en arrière plan
 * ce dao est une "dépendance" à injecter et à utiliser pour déléguer
 */
public class ServiceCompteImpl implements IServiceCompte {
	//IDaoCompte est un type abstrait qui en englobe DoaCompteJpa et DaoCompteSimu
	private IDaoCompte daoCompte; //null par défaut 
	
    //méthode d'injection de dépendance qui sera automatiquement appelée par Spring
	public void setDaoCompte(IDaoCompte daoCompte) {
		this.daoCompte = daoCompte;
	}

	@Override
	public Compte rechercherCompteParNumero(Long numero) {
		return daoCompte.findCompteByNum(numero);
	}

	@Override
	public List<Compte> rechercherComptesDuClient(Long numClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void transferer(double montant, Long numCptDeb, Long numCptCred) {
		// TODO Auto-generated method stub

	}

}
