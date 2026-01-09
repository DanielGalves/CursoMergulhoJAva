package com.dgama.banco.modelo.atm;

import com.dgama.banco.modelo.Conta;
import com.dgama.banco.modelo.pagamento.DocumentoEstornavel;
import com.dgama.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {

    public void imprimirSaldo(Conta conta){
        System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
        System.out.println("Titular: " + conta.getTitular().getNome());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Saldo disponivel: " + conta.getSaldoDisponivel());


    }

    public void pagar(DocumentoPagavel documento, Conta conta) throws IllegalAccessException {
        if (documento.estaPago()){
            throw  new IllegalAccessException("Documento já está pago");
        }
        conta.sacar(documento.getValorTotal());
        documento.quitarPagamento();
    }

    public void estornarPagamento(DocumentoEstornavel documento, Conta conta) throws IllegalAccessException {
        if (!documento.estaPago()){
            throw new IllegalAccessException("Documento ainda não está pago");
        }
        conta.depositar(documento.getValorTotal());
        documento.estornarPagamento();
    }

}
