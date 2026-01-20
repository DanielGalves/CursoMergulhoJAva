package com.dgama.banco.app;

import com.dgama.banco.modelo.Conta;

import java.util.function.ToIntFunction;

public class NumeroCotaFunction implements ToIntFunction<Conta> {
    @Override
    public int applyAsInt(Conta conta) {
        return conta.getNumero();
    }
}
