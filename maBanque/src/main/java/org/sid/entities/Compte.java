package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
//@Inheritance = heritage, strategy = il existe plusieurs strategies...
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CPTE", discriminatorType = DiscriminatorType.STRING)
public abstract class Compte implements Serializable {
	//pas de @GeneratedValue car il sagit d'un type String
	@Id
	private String codeCompte;
	private Date dateCreation;
	private double solde;
//un compte appartient à un client "rapport * à 1" @ManyToOne
	@ManyToOne
	@JoinColumn(name = "CODE_CLI")
	private Client client;
//un compte peut subir une ou plusieurs operations 
	@OneToMany(mappedBy = "compte")
	private Collection<Operation> operations;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(String codeCompte, Date dateCreation, double solde, Client client) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
	}

	public String getCodeCompte() {
		return codeCompte;
	}

	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}

	
}
