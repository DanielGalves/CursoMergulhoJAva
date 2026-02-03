package com.dgama.banco.app;

import com.dgama.banco.modelo.Banco;
import com.dgama.banco.modelo.Conta;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;

public class Principal4 {
    public static void main(String[] args) throws IllegalAccessException {

        Banco banco = new Banco();

        //Stream<Conta> stream = banco.getContas().stream();
        //Stream<Conta> stream2 = stream.filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0);
        //Stream<Conta> stream3 = stream2.filter(conta -> conta.getNumero()>300);

        //refatorado
        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0)
                .filter(conta -> conta.getNumero() > 300)
                .sorted(Comparator.comparingInt(Conta::getNumero))
                .forEach(conta -> {
                    System.out.println(conta.getAgencia() + "/" + conta.getNumero() + " = " + conta.getSaldo());
        });

    }
}
