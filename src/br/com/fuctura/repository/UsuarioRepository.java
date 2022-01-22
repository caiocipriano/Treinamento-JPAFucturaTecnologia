package br.com.fuctura.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import br.com.fuctura.models.Usuario;
import br.com.fuctura.utils.JPAUtil;

public class UsuarioRepository {
	
	public void incluir(Usuario usuario) {
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction transacao = em.getTransaction();
		
		transacao.begin();
		em.persist(usuario);
		transacao.commit();
		
		em.close();
	}
	
	public List<Usuario> pesquisarPorNome(String email, String senha){
		EntityManager em = JPAUtil.getEntityManager();
		Query consulta = em.createQuery("SELECT u FROM Usuario u WHERE u.email LIKE :email AND u.senha.valor LIKE :senha");
		consulta.setParameter("email", email);
		consulta.setParameter("senha", senha);
		List<Usuario> resultado = consulta.getResultList();
		return resultado;
		
	}
	
}
