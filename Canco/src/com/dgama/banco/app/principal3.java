package com.dgama.banco.app;

import com.dgama.banco.modelo.Banco;
import com.dgama.banco.modelo.Conta;

import java.util.Comparator;
import java.util.function.ToIntFunction;

public class principal3 {
    public static void main(String[] args) throws IllegalAccessException {

        Banco banco = new Banco();

       // ToIntFunction<Conta> function = (Conta conta) -> {
       //   return conta.getNumero();
       // };

        //banco.getContas().sort(Comparator.comparingInt(new NumeroCotaFunction()));
        //banco.getContas().sort(Comparator.comparingInt(conta -> conta.getNumero()));

        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));

        for (Conta conta : banco.getContas()){
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());

        }
    }
}
