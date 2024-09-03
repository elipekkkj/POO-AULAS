package com.poo.aula4;

public class Endereco {

    int id;
    String logradouro;
    String numero;
    String complemento;
    String bairro;
    String cidade;
    String estado;
    String cep;


    void imprimeEndereco(){

    System.out.print("\n" + this.numero + "\n");
    System.out.println(this.bairro);
    System.out.println(this.cidade);
    System.out.println(this.cep);

    }
}
