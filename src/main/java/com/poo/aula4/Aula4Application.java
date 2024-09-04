package com.poo.aula4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula4Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula4Application.class, args);
	
	//Criando um novo cliente
	Cliente cliente1 = new Cliente();
	cliente1.nome = "Luis Filipe";
	cliente1.cpf = "264.876.874-46";
	cliente1.dataNascimento = "09/07/2006";
	cliente1.login = "elipekkj";
	cliente1.senha = "lipe007";
	cliente1.email = "luisct007@gmail.com";
	cliente1.telefone = "(24)98809-5644";

	//Instanciando um novo objeto end do tipo endereco
	Endereco end = new Endereco();
	
	//Atribuição do end para o atributo endereco da classe
	//ClientePessoaFisica
	cliente1.endereco = end;

	end.cep = "25.675-021";
	end.bairro = "Mosela";
	end.cidade = "Petrópolis";
	end.numero = "61 H";
	
	//Instanciar uma conta
	Conta conta1 = new Conta(cliente1, "Conta corrente");
	Conta conta2 = new Conta();

	conta1.imprimeDadosDaConta();
	conta2.imprimeDadosDaConta();

	}
}
