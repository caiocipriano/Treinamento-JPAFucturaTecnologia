package br.com.fuctura;

import java.util.Scanner;

import br.com.fuctura.models.Lancamento;
import br.com.fuctura.models.Senha;
import br.com.fuctura.models.Tipo;
import br.com.fuctura.models.Usuario;
import br.com.fuctura.repository.SenhaRepository;
import br.com.fuctura.repository.UsuarioRepository;
import br.com.fuctura.utils.JPAUtil;

public class Aplication {
	
	public static void main(String[] args) {
		
		JPAUtil.getEntityManager();
				
		UsuarioRepository usuRepo = new UsuarioRepository();
		//SenhaRepository senhaRepo = new SenhaRepository();
	
		System.out.println("Oque você deseja?");
		System.out.println("1-Gerenciar Usuário");
		System.out.println("2-Gerenciar Conta");
		System.out.println("3-Gereniar Banco");
		System.out.print("Digite:");
		Scanner scanner = new Scanner(System.in);
		int escolha = scanner.nextInt();
		
		if(escolha == 1) {
			System.out.println("Oque deseja fazer com ele?");
			System.out.println("1-Cadastrar");
		
			Scanner scannerM = new Scanner(System.in);
			int escolhaUser = scanner.nextInt();
			
			switch(escolhaUser) {
				case 1:
					Scanner scannerCadastro = new Scanner(System.in);
		
					System.out.println("Nome:");
					String nome = scannerCadastro.nextLine();
					
					System.out.println("Email:");
					String email = scannerCadastro.nextLine();
					
					System.out.println("Senha:");
					String senha = scannerCadastro.nextLine();
		
					System.out.println("Idade:");
					int idade = scannerCadastro.nextInt();
					
					Senha novaSenha = new Senha();
					Usuario novoUsuario = new Usuario();

					novoUsuario.setNome(nome);
					novoUsuario.setEmail(email);
					novoUsuario.setIdade(idade);
					novaSenha.setValor(senha);
					
					usuRepo.incluir(novoUsuario);
					//senhaRepo.incluir(novaSenha);
					
					System.out.println("Finalizado!!!");
				break;
			}
		}else if(escolha ==2) {
		Scanner scannerLancamento = new Scanner(System.in);

			System.out.println("Digite seu Email:");
			String email= scannerLancamento.nextLine();
			
			Usuario login = usuRepo.pesquisarPorEmail(email);
			
			
			System.out.println("Descrição:");
			String descricao = scannerLancamento.nextLine();
			
			System.out.println("Valor:");
			Double valor = scannerLancamento.nextDouble();
			
			System.out.println("Tipo:");
			System.out.println("1-Despesa");
			System.out.println("2-Receita");
			Integer tipo = scannerLancamento.nextInt();		
			
			Tipo tipoEncontrado = tipoRepository.pesquisarporChavePrimaria(tipo);
	
			Lancamento novoLancamento = new Lancamento();
			novoLancamento.setDescricao(descricao);
			novoLancamento.setValor(valor);
		
			novoLancamento.setTipo(tipoEncontrado);
			novoLancamento.setUsuario(login);
			
		}
	}
}

