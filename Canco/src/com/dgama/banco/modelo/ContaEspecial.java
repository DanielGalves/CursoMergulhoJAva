package com.dgama.banco.modelo;

import java.math.BigDecimal;

public class ContaEspecial extends Conta {

    private BigDecimal valorLimite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimite){
        super(titular,agencia,numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public void debitarTarifaMensal() throws IllegalAccessException {
        if (getSaldo().compareTo(new BigDecimal("10000")) < 0){
            sacar(new BigDecimal("30"));
        }
    }

    @Override
    public BigDecimal getSaldoDisponivel() {

        return getSaldo();
    }

    public BigDecimal getValorLimite(){
        return valorLimite;
    }

    public void setValorLimite(BigDecimal valorLimite){
        this.valorLimite = valorLimite;
    }




}
