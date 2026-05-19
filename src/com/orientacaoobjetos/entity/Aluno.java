package com.orientacaoobjetos.entity;

public class Aluno {

    // Atributos privados
    private String nome;
    private int idade;
    private double[] notas;

    // Construtor
    public Aluno(String nome, int idade, int quantidadeProvas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = new double[quantidadeProvas];
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNota(int indice, double nota) {
        notas[indice] = nota;
    }

    public double calcularMedia() {

        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }
}

