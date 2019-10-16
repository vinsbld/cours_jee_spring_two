package org.sid;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MaBanqueApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;

	public static void main(String[] args) {
		SpringApplication.run(MaBanqueApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		Client c1 = clientRepository.save(new Client("Hassan", "hassan@gmail.com"));
		Client c2 = clientRepository.save(new Client("Vincent", "vincent@gmail.com"));
	}

}
