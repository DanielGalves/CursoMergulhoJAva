package com.dgama.banco.app;

import com.dgama.banco.modelo.Pessoa;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {

    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa("JOão da Silva", "123456789");
        Pessoa pessoa2 = new Pessoa("Maria das Couves", "98765432");
        Pessoa pessoa3 = new Pessoa("José Bigorna", "828282828282");


       List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        //System.out.println(pessoas);

        Pessoa pessoa4 = pessoas.get(2);
        //System.out.println(pessoa4);
        // for (int i = 0; i< pessoas.size(); i++){
        //    System.out.println(pessoas.get(i).getNome());
        //}

       // for (Pessoa pessoaFor : pessoas){
       //     System.out.println(pessoaFor.getNome());
       // }



        boolean existe = pessoas.contains(pessoa1);
        System.out.println(existe);

        Pessoa pessoa5 = new Pessoa("JOão da Silva", "123456789");
        System.out.println(pessoa1.equals(pessoa5));
    }
}
