package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public abstract class Operation implements Serializable {
private long numero;
private Date dateOperation;
private double montant;
//une operation appartient à un compte
private Compte compte;
public Operation() {
	super();
	// TODO Auto-generated constructor stub
}
public Operation(Date dateOperation, double montant, Compte compte) {
	super();
	this.dateOperation = dateOperation;
	this.montant = montant;
	this.compte = compte;
}
public long getNumero() {
	return numero;
}
public void setNumero(long numero) {
	this.numero = numero;
}
public Date getDateOperation() {
	return dateOperation;
}
public void setDateOperation(Date dateOperation) {
	this.dateOperation = dateOperation;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}


}
