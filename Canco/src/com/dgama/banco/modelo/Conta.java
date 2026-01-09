package com.dgama.banco.modelo;

import com.dgama.banco.modelo.excecao.SaldoInsuficienteException;

import java.util.Objects;

public abstract class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Pessoa titular,int agencia,int numero){
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;

    }

    public void depositar(double valor) throws IllegalAccessException {
        if (valor <= 0){
            throw new IllegalAccessException("Valor de ser maior que 0");
        }
        saldo = saldo + valor;
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (getSaldoDisponivel() - valor < 0 ){
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }
        if (valor <= 0){
            throw new SaldoInsuficienteException("Valor deve ser maior que 0");
        }
        saldo = saldo - valor;
    }

    public void sacar(double valor, double taxaSaque) throws IllegalAccessException {sacar(valor + taxaSaque); }

    public abstract void debitarTarifaMensal() throws IllegalAccessException;


    public Pessoa getTitular() {return titular;}

    public int getAgencia() {return agencia;}

    public int getNumero() {return numero;}

    public double getSaldo() {return saldo;}

    public double getSaldoDisponivel(){return getSaldo();}

}
