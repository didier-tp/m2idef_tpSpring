package com.capgemini.dao.jpa;

import java.util.List;

import com.capgemini.dao.IDaoCompte;
import com.capgemini.entity.Compte;

public class DaoCompteJpa implements IDaoCompte {

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
