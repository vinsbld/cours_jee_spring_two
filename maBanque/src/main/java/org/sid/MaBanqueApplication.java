package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MaBanqueApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(MaBanqueApplication.class, args);
		//avec l'Objet clientResository on pourra gerer des clients
		ClientRepository clientRepository = ctx.getBean(ClientRepository.class);
		//ajuout de clients avec la methode save
		clientRepository.save(new Client("Hassan", "hassan@gmail.com"));
	}

}
