package com.orientacaoobjetos.entity;

public class Professor {

    private String nome;
    private int idade;
    private String escola;
    private String materia;

    public Professor(String nome, int idade, String escola) throws Exception {

        this.nome = nome;
        this.escola = escola;
        validarIdade(idade);
    }
    public Professor(String nome, int idade) throws Exception {

        this.nome = nome;
        validarIdade(idade);
    }

    @Override
    public String toString() {
        return "Nome: %s\nIdade: %d\nEscola: %s\nMatéria: %s\n".formatted(nome, idade, escola, materia);
    }

    private int validarIdade(int idade) throws Exception {
        if (idade < 18){
            throw new Exception(

                    "A idade de %d anos não é permitida."

                    .formatted(idade));
        }
        return idade;
    }

    //getters e setters


    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws Exception {
        this.idade = validarIdade(idade);
    }
}
