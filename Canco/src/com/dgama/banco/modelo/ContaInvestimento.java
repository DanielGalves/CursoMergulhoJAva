package com.dgama.banco.modelo;

public class ContaInvestimento extends Conta {



    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal() throws IllegalAccessException {
        sacar(20);
    }

    public void creditarRendimentos(double percentualJuros) throws IllegalAccessException {
        double valorRendimentos = getSaldo() + percentualJuros /100;
        depositar(valorRendimentos);

    }
}
