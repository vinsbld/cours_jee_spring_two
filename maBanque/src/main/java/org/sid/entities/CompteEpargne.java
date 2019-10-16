package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
//un compteEpargne herite de la class Compte
@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
private double taux;

public CompteEpargne() {
	super();
	// TODO Auto-generated constructor stub
}

public CompteEpargne(String codeCompte, Date dateCreation, double solde, Client client, double taux) {
	super(codeCompte, dateCreation, solde, client);
	this.taux = taux;
}

public double getTaux() {
	return taux;
}

public void setTaux(double taux) {
	this.taux = taux;
}

}
