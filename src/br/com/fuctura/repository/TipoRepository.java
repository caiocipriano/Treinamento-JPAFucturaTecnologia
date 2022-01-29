package br.com.fuctura.repository;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.fuctura.models.Tipo;
import br.com.fuctura.utils.JPAUtil;

public class TipoRepository {
	
	public void incluir(Tipo tipo) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transacao = em.getTransaction();
		
		transacao.begin();
		em.persist(tipo);
		transacao.commit();
		
		em.close();
	}
	
	public Tipo pesquisarPorChavePrimaria(Integer tipo) {
		EntityManager em = JPAUtil.getEntityManager();
		Tipo resultado = em.find(Tipo.class, tipo);
		return resultado;
	}

	
}
