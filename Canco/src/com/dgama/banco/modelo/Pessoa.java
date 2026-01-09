package com.dgama.banco.modelo;

public class Pessoa {

    private String nome;
    private String documento;
    private Double rendimentoAnual;
    private TipoPessoa tipo = TipoPessoa.FISICA;


    public Double getRendimentoAnual(double v) {return rendimentoAnual;}

    public void setRendimentoAnual(Double rendimentoAnual) {this.rendimentoAnual = rendimentoAnual;}

    public String getNome() {return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public TipoPessoa getTipo(){ return tipo;}

    public void setTipo(TipoPessoa tipo){this.tipo = tipo;}

}
