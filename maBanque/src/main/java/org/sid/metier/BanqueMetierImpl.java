package org.sid.metier;

import java.util.Optional;

import org.sid.dao.CompteRepository;
import org.sid.entities.Compte;
import org.sid.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//redefinir les methodes "add unimplemented methods"
//pour que spring puisse instencier cette class au demarrage : @Service
//@Transactional ttes les methodes sont transactionnelles
@Service
@Transactional
public class BanqueMetierImpl implements IBanqueMetier  {
	//appel de la couche dao
	@Autowired
	private CompteRepository compteRepository;

	@Override
	public Compte consulterCompte(String codeCpte) {
		//pour consulter un compte
		Optional<Compte> compte=compteRepository.findById(codeCpte);
		Compte cp = null;
		 if(compte.isPresent()) {
	            cp = compte.get();
	        }else throw new RuntimeException("Compte introuvable");
	        return cp;
	}

	@Override
	public void verser(String codeCpte, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirer(String codeCpte, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void virement(String codeCpte1, String codeCpte2, double montant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Page<Operation> listOperation(String codeCpte, int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}

}
