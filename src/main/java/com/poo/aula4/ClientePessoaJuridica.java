package com.poo.aula4;

public class ClientePessoaJuridica {
    
    int id;
    String cnpj;
    String nomeFantasia;
    String razaoSocial;
    Endereco endereco;
    String telefone;
    String login;
    String senha;
    String cnae; // Cassif. Nacional de Ativ. Econ.

    //Implementar acesso da empresa por funcionario
    
    // Métodos

    void imprimeJuridico(){

        System.out.println(this.cnpj);
        System.out.println(this.nomeFantasia);
        System.out.println(this.razaoSocial);
        System.out.println(this.telefone);
        System.out.println(this.login);
        System.out.println(this.senha);
        System.out.println(this.cnae);


    }
}
