package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CataMvc6Application implements CommandLineRunner {

	@Autowired
	private ProduitRepository produitRepository;

	public static void main(String[] args) {
		SpringApplication.run(CataMvc6Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		produitRepository.save(new Produit(null, "Zakaria", 1968, 52));
		produitRepository.save(new Produit(null, "PC 5648", 6000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 1234", 1200, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 9000, 1));
		produitRepository.save(new Produit(null, "Scanner", 1000, 16));
		produitRepository.save(new Produit(null, "PC 5652", 5000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 5634", 500, 10));
		produitRepository.save(new Produit(null, "PC Compact", 900, 1));
		produitRepository.save(new Produit(null, "Scanner dd", 100, 16));
		produitRepository.save(new Produit(null, "PC 5688", 600, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 12", 120, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 90, 1));
		produitRepository.save(new Produit(null, "Scanner", 10, 16));
		produitRepository.save(new Produit(null, "PC 5648", 6000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 1234", 1200, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 9000, 1));
		produitRepository.save(new Produit(null, "Scanner", 1000, 16));
		produitRepository.save(new Produit(null, "PC 5652", 5000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 5634", 500, 10));
		produitRepository.save(new Produit(null, "PC Compact", 900, 1));
		produitRepository.save(new Produit(null, "Scanner dd", 100, 16));
		produitRepository.save(new Produit(null, "PC 5688", 600, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 12", 120, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 90, 1));
		produitRepository.save(new Produit(null, "Scanner", 10, 16));
		produitRepository.save(new Produit(null, "PC 5648", 6000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 1234", 1200, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 9000, 1));
		produitRepository.save(new Produit(null, "Scanner", 1000, 16));
		produitRepository.save(new Produit(null, "PC 5652", 5000, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 5634", 500, 10));
		produitRepository.save(new Produit(null, "PC Compact", 900, 1));
		produitRepository.save(new Produit(null, "Scanner dd", 100, 16));
		produitRepository.save(new Produit(null, "PC 5688", 600, 12));
		produitRepository.save(new Produit(null, "Imprimente HP 12", 120, 10));
		produitRepository.save(new Produit(null, "PC Compacp", 90, 1));
		produitRepository.save(new Produit(null, "Scanner", 10, 16));
		produitRepository.findAll().forEach(p -> {
			System.out.println(p.getDesignation());
		});
	}
}



	
	
	
	
/*
 * 
 * Part 1(updated)- Spring MVC Server Side Thymeleaf JPA Hibernate Spring data
 * https://www.youtube.com/watch?v=flrPET5f_qs
 * 
 * Part 2 (Updated) Spring MVC JPA Hibernate Spring data Spring security
 * https://www.youtube.com/watch?v=Ru7pBdAz4sI
 * 
 * Part 3 (Updated) Spring MVC JPA Hibernate Spring data Spring security
 * https://www.youtube.com/watch?v=4bUPGTNAHzc
 * Cette vidéo est une version actualisée de de la série 
 * des vidéos sur Spring MVC Server Side en utilisant des
 *  version plus actualisées de Spring Boot et Thymeleaf

Cette partie traite :
- La gestion des Layout (Pages Template)
- La validation des formulaire
- Sécurité avec Spring Security
 * 
 * 
 */

//Cette vidéo est une version actualisée de de la série des vidéos sur Spring MVC Server Side en utilisant des version plus actualisées de Spring Boot et Thymeleaf
//
//La vidéo explique l'architecture de Spring MVC et montre comment créer une application qui permet de gérer des produits. Elle explique les étapes suivantes:
//- Créer un projet Spring Starter avec les dépendances JPA, MySQL, Web et Thymeleaf 
//- Créer une entité JPA
//- Configurer l'unité de persistance
//- Créer une interface JPARepository basée sur Spring Data
//- Tester le couche DAO
//- Créer un Contrôleur Spring MVC
//- Créer une vue basée sur le moteur de templates Thymeleaf
//- Intégrer Bootstrap3 avec thymeleaf
