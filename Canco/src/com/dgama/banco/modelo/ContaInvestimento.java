package com.dgama.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaInvestimento extends Conta {



    public ContaInvestimento(Pessoa titular, int agencia, int numero){
        super(titular, agencia, numero);
    }

    @Override
    public void debitarTarifaMensal() throws IllegalAccessException {
        sacar(new BigDecimal("20"));
    }

    public void creditarRendimentos(BigDecimal percentualJuros) throws IllegalAccessException {
        BigDecimal valorRendimentos = getSaldo()
                .multiply(percentualJuros )
                .divide(new BigDecimal("100"),2, RoundingMode.HALF_EVEN);
        depositar(valorRendimentos);

    }
}
