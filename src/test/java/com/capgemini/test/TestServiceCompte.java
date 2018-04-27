package com.capgemini.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.entity.Compte;
import com.capgemini.service.IServiceCompte;

@RunWith(SpringJUnit4ClassRunner.class) //avec spring-test dans pom.xml
@ContextConfiguration("/springConfig.xml") //charger une seule fois => test performant
public class TestServiceCompte {
	
	@Autowired
	private IServiceCompte serviceCompte; //à tester
	
	@Test
	public void testRechercherCompteParNumeroQuiVaSuperBien() {
		Compte c1 = this.serviceCompte.rechercherCompteParNumero(1L);
		Assert.assertTrue(c1.getNumero()==1L);
		System.out.println("c1="+c1.toString());
	}
}
