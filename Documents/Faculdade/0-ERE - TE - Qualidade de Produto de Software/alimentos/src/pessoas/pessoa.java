package pessoas;

import alimentacao.dieta;

public class pessoa {
    private String nome, CPF;
    private float peso, altura;
    private dieta alimentacao;

    public pessoa(String n, String cpf, float p, float a){
        this.nome = n;
        this.CPF = cpf;
        this.peso = p;
        this.altura = a;
        alimentacao = new dieta();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public dieta getAlimentacao() {
        return alimentacao;
    }

    public void setCardapio(dieta ali) {
        this.alimentacao = ali;
    }
}
