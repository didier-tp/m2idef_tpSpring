package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IDaoClient;
import com.capgemini.entity.Client;
/*
 * classe d'implémentation du service
 * qui ne fonctionne qu'avec un composant dao en arrière plan
 * ce dao est une "dépendance" à injecter et à utiliser pour déléguer
 */
//@Component
@Service //@Service herite de @Component
public class ServiceClientImpl implements IServiceClient{
	
	@Autowired
	private IDaoClient daoClient; //null par défaut 

	@Override
	public Client rechercherClientParNumero(Long numero) {
		return daoClient.findClientByNum(numero);
	}

	@Override
	public List<Client> rechercherTousClient() {
		return daoClient.findAllClients();
	}

}
