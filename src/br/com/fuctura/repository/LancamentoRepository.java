package br.com.fuctura.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.fuctura.models.Lancamento;
import br.com.fuctura.models.Usuario;
import br.com.fuctura.utils.JPAUtil;

public class LancamentoRepository {
	
	
	public void incluir(Lancamento lancamento) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transacao = em.getTransaction();
		
		transacao.begin();
		em.persist(lancamento);
		transacao.commit();
		
		em.close();
	}
}
