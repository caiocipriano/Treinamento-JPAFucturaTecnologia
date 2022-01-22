package br.com.fuctura.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.fuctura.models.Senha;
import br.com.fuctura.models.Usuario;
import br.com.fuctura.utils.JPAUtil;

public class SenhaRepository {
	
	public void incluir(Senha senha) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transacao = em.getTransaction();
		
		transacao.begin();
		em.persist(senha);
		transacao.commit();
		
		em.close();
	}
	
}
