package com.poo.aula4;

public class Conta {
        
    int id;
    ClientePessoaFisica titular;
    String numeroConta;
    String agencia;
    String tipoConta;
    String dataAbertura;
    String statusConta;
    double limiteCredito;
    double saldo;
    String historicoTransacao;

    void imprimeConta(){

    System.out.print("\n" + this.tipoConta + "\n");
    System.out.println(this.numeroConta);
    System.out.println(this.agencia);
    System.out.println(this.saldo);
    
    }
}
