package com.dgama.banco.app;

import com.dgama.banco.modelo.*;
import com.dgama.banco.modelo.atm.CaixaEletronico;
import com.dgama.banco.modelo.excecao.SaldoInsuficienteException;
import com.dgama.banco.modelo.pagamento.Boleto;
import com.dgama.banco.modelo.pagamento.DocumentoEstornavel;
import com.dgama.banco.modelo.pagamento.Holerite;

import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) throws IllegalAccessException {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("Maria Abadia");
        titular1.setDocumento("111.222.333-55");
        titular1.getRendimentoAnual(new BigDecimal("15000"));

        Pessoa  titular2 = new Pessoa();
        titular2.setNome("José Manoel");
        titular2.setDocumento("999.888.777-66");


        ContaInvestimento minhaConta = new ContaInvestimento(titular1,0001,1000);
        ContaEspecial suaConta = new ContaEspecial(titular2,0001,1001,new BigDecimal("50000"));

        CaixaEletronico caixaEletronico = new CaixaEletronico();

       try {
           minhaConta.depositar(new BigDecimal("30000"));
           minhaConta.sacar(new BigDecimal("5000"), new BigDecimal("10"));

           suaConta.depositar(new BigDecimal("30000"));
           suaConta.debitarTarifaMensal();

           minhaConta.creditarRendimentos(new BigDecimal("0.8"));
           minhaConta.debitarTarifaMensal();

           Holerite salarioFuncionario = new Holerite(titular1, new BigDecimal("800"), 40);
           caixaEletronico.pagar(salarioFuncionario, minhaConta);

           DocumentoEstornavel boletoEscola = new Boleto(titular2, new BigDecimal("200"));
           caixaEletronico.pagar(boletoEscola, minhaConta);

           //caixaEletronico.estornarPagamento(boletoEscola, minhaConta);
           System.out.println("Salario pago: " + salarioFuncionario.estaPago());

           System.out.println();
           System.out.println("***********************************");
           System.out.println();

           boletoEscola.imprimirRecibo();

           System.out.println("Boleto pago: " + boletoEscola.estaPago());
       } catch(SaldoInsuficienteException e){
           System.out.println("Erro ao executar operação na conta: " + e.getMessage());
       }

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println();
        caixaEletronico.imprimirSaldo(suaConta);



    }
}
