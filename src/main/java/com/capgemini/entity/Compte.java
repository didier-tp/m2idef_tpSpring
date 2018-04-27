package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Compte")
public class Compte {
	    @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		
	    private Long numero;
		private String label;
		private Double solde;
		//...
		
		public Compte() {
		}
		
		public Compte(Long numero, String label, Double solde) {
			this.numero = numero;
			this.label = label;
			this.solde = solde;
		}
		
	
		@Override
		public String toString() {
			return "Compte [numero=" + numero + ", label=" + label + ", solde=" + solde + "]";
		}

		public Long getNumero() {
			return numero;
		}
		
		public void setNumero(Long numero) {
			this.numero = numero;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public Double getSolde() {
			return solde;
		}
		public void setSolde(Double solde) {
			this.solde = solde;
		}
		
}
