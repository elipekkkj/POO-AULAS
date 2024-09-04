package com.poo.aula4;

public class Cliente {
	
    int id;
    String  nome;
    String  cpf;
    String  dataNascimento;
    String  login;
    String  senha;
    Endereco endereco;
    Conta conta;
    String  email;
    String  telefone;
        

    void imprimeFicha(){
            System.out.println(this.nome);
            System.out.println(this.cpf);
            System.out.println(this.dataNascimento);
            System.out.println(this.login);
            System.out.println(this.senha);
            System.out.println(this.email);
            System.out.println(this.telefone);

            this.endereco.imprimeEndereco();

        //o this retorna para quem chama, se o cliente1 chama
        //ele imprime os dados do cliente1, se for o
        //cliente2 ele imprime deste cliente2 
        //dessa forma qualquer objeto pode chamar o método
        //pois é genérico
    }
}

