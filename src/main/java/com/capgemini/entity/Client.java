package com.capgemini.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		
	    private Long numero;
	    
	    @Column(length=32) //pour VARCHAR(32)
		private String nom;
	    
	    @Column(length=32) //pour VARCHAR(32)
		private String prenom;
	    
	    @Column(length=64) //pour VARCHAR(64)
	    private String adresse;
		//...
		
		public Client() {
		}
		
		

		@Override
		public String toString() {
			return "Client [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
		}



		public Long getNumero() {
			return numero;
		}

		public void setNumero(Long numero) {
			this.numero = numero;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getAdresse() {
			return adresse;
		}

		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		
		
		
	
		
}
