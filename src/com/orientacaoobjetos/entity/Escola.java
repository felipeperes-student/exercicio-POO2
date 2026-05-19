package com.orientacaoobjetos.entity;

public class Escola {

    private String nome;
    private String diretor;
    private String cnpj;
    private String[]nomesProfessores;
    private static int contadorProfessores;

    public Escola(String nome){
        this.nome = nome;
        nomesProfessores = new String[10];
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void addProfessor(String nomeProfessor){
        nomesProfessores[contadorProfessores] = nomeProfessor;
        contadorProfessores++;

    }

    public String[] getNomesProfessores() {
        return nomesProfessores;
    }
}
