package com.poo.aula4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula4Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula4Application.class, args);
	
	
	ClientePessoaFisica cliente = new ClientePessoaFisica();
	
	cliente.nome = "Luis Filipe";
	cliente.cpf = "264.876.874-46";
	cliente.dataNascimento = "09/07/2006";
	cliente.login = "elipekkj";
	cliente.senha = "lipe007";
	cliente.email = "luisct007@gmail.com";
	cliente.telefone = "(24)98809-5644";

	//Instanciando um novo objeto do tipo endereco
	Endereco end = new Endereco();
	
	//Alimentando o objeto endereco antes de atribuir	
	//end.cep = "20.202-202";
	//...
	
	//Atribuição do end para o atributo endereco da classe
	//ClientePessoaFisica
	cliente.endereco = end;

	end.cep = "25.675-021";
	end.bairro = "Mosela";
	end.cidade = "Petrópolis";
	end.numero = "61 H";

	Conta ct = new Conta();
	cliente.conta = ct;

	ct.numeroConta = "23144567-22";
	ct.agencia = "000-1";
	ct.tipoConta = "Conta corrente";
	ct.saldo = 2495.55;

	cliente.imprimeFicha();
	
	// ClientePessoaJuridica, Gerente, Atendente, Agencia, Conta

	}
}
