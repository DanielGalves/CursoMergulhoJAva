package com.dgama.banco.modelo.pagamento;

import java.sql.SQLOutput;

public interface DocumentoPagavel {

    double getValorTotal();
    boolean estaPago();
    void quitarPagamento();

    default void imprimirRecibo(){
        System.out.println("////////*\\\\\\\\");
        System.out.println("");
        System.out.println("RECIBO:");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
        System.out.println("");
        System.out.println("////////*\\\\\\\\");
    }

}
