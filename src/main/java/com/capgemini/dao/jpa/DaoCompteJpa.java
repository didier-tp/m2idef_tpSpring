package com.capgemini.dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import com.capgemini.dao.IDaoCompte;
import com.capgemini.entity.Compte;

/*
 * classe d'implémentation du DAO qui 
 * s'appuie sur JPA/Hibernate
 */
public class DaoCompteJpa implements IDaoCompte {
	
	private EntityManager entityManager;

	@Override
	public Compte findCompteByNum(Long numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> findComptesDuClient(Long numClient) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Compte createCompte(Compte c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCompte(Compte c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCompte(Compte c) {
		// TODO Auto-generated method stub

	}

}
