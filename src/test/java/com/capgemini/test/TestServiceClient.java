package com.capgemini.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.capgemini.entity.Client;
import com.capgemini.service.IServiceClient;

@RunWith(SpringJUnit4ClassRunner.class) //avec spring-test dans pom.xml
@ContextConfiguration("/springConfig.xml") //charger une seule fois => test performant
public class TestServiceClient {
	
	@Autowired
	private IServiceClient serviceClient; //à tester
	
	@Test
	public void testRechercherClientParNumero() {
		Client c1 = this.serviceClient.rechercherClientParNumero(1L);
		Assert.assertTrue(c1.getNumero()==1L);
		System.out.println("c1="+c1.toString());
	}
	
	@Test
	public void testRechercherTousClients() {
		List<Client> listeClients = this.serviceClient.rechercherTousClient();
		Assert.assertTrue(listeClients.size()>=2);
		System.out.println("listeClients="+listeClients);
	}
}
