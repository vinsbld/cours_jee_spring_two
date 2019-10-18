package org.sid.web;

import org.sid.entities.Compte;
import org.sid.entities.Operation;
import org.sid.metier.IBanqueMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BanqueController {

	@Autowired
	private IBanqueMetier banqueMetier;

	@RequestMapping("/operations")
	public String index() {
		return "comptes";
	}
	
	@RequestMapping("/consulterCompte")
	public String consulter(Model model, String codeCompte) {
		model.addAttribute("codeCompte", codeCompte);

		try {
			Compte cp = banqueMetier.consulterCompte(codeCompte);
			Page<Operation> pageOperation=banqueMetier.listOperation(codeCompte, 0, 4);
			model.addAttribute("listOperations", pageOperation.getContent());
			model.addAttribute("compte",cp);
		} catch (Exception e) {
			model.addAttribute("exception",e);
		}

		return "comptes";
	}
}
