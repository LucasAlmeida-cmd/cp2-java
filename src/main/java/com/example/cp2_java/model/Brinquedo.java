package com.example.cp2_java.model;

import jakarta.persistence.*;

@Entity
@Table(name = "TDS_TB_Brinquedos")
@SequenceGenerator(name = "brinquedo", sequenceName = "SQ_USER_BRINQUEDO", allocationSize = 1)
public class Brinquedo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brinquedo")
    @Column(name = "id_brinquedo")
    private Long id;

    @Column(name = "nome_brinquedo", nullable = false)
    private String nome;

    @Column(name = "tipo_brinquedo", nullable = false)
    private String tipo;

    @Column(name = "classificacao_brinquedo", nullable = false)
    private String classificacao;

    @Column(name = "tamanho_brinquedo", nullable = false)
    private double tamanho;

    @Column(name = "preco_brinquedo", nullable = false)
    private double preco;

    public Brinquedo(String nome, String tipo, String classificacao, double tamanho, double preco) {
        this.nome = nome;
        this.tipo = tipo;
        this.classificacao = classificacao;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public Brinquedo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}