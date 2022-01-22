package br.com.fuctura.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.fuctura.models.Tag;
import br.com.fuctura.utils.JPAUtil;

public class TagRepository {
	public void incluir(Tag tag) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transacao = em.getTransaction();
		
		transacao.begin();
		em.persist(tag);
		transacao.commit();
		
		em.close();
	}
}
