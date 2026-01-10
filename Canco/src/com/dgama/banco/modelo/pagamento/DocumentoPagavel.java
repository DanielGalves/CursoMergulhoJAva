package com.dgama.banco.modelo.pagamento;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public interface DocumentoPagavel {

    BigDecimal getValorTotal();
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
