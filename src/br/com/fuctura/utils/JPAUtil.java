package br.com.fuctura.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	
	private static EntityManagerFactory fabrica;
	
	
	static {
		 fabrica = Persistence.createEntityManagerFactory("Fuctura-PU");
	}
	
	public static EntityManager getEntityManager() {
		return fabrica.createEntityManager();
		}
}
