package com.poo.aula4;

//Resolver o problema das especificações
public class Conta {
        
    private int id; // Geração automática
    private Cliente titular; // Gerente informa o titular
    private String numeroConta; // Geração automatica
    private Agencia agencia; // Associada a agencia do Gerente
    private String tipoConta; //poupança, salário, corrente // Gerente ira informar
    private String dataAbertura; // Data de abertura do momento
    private String statusConta; // Bloqueado, Ativa, Em Análise, Suspensa(30 dias...), Inativa
    private char classificacao; //A, B, C OU D
    private double saldo; // Saldo = 0
    
    
    // Construtores
    public Conta(Cliente cliente, String tipoConta){
        this.id = 1; // O proximo deve ser 2
        this.saldo = 0;
        this.dataAbertura = "03/09/2024";
        this.numeroConta = "1234-0"; // a proxima deve ser 1235-0
        this.classificacao = 'A';
        this.statusConta = "Ativa";
        this.titular = cliente;
        this.tipoConta = tipoConta;
    }
    
    public Conta(){

    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(String statusConta) {
        this.statusConta = statusConta;
    }

    public char getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(char classificacao) {
        this.classificacao = classificacao;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        //Determinar como eu posso alterar o atributo saldo
        this.saldo = saldo;
    }
    
    
    //Outros metodos
    public void exibeSaldo(){
    System.out.println("Conta: " + this.numeroConta);
    System.out.println("Titular: " + this.titular);
    System.out.println("Saldo: R$" + this.saldo);
    }

    public void imprimeDadosDaConta(){
    System.out.println("Conta: " + this.numeroConta);
    System.out.println("Titular: " + this.titular);
    System.out.println("Saldo: R$" + this.saldo);
    System.out.println("Data Abertura: " + this.dataAbertura);
    System.out.println("Tipo da Conta: " + this.tipoConta);
    System.out.println("Status da Conta: " + this.statusConta);
    System.out.println("Classificação: " + this.classificacao);
    
    }
    
}
