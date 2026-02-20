package br.com.fiap.entities;

public class Cliente {
    // Visiblidade, tipo de dados e atributos
    //Private = encapsulamento. Define aquela classe em específico e somente acessa ela
    private String nome, cpf; //Joao123 ou 111.111.111-11
    private int idade; // 18
    private double altura; //1.56

    // Métodos setters (entrada), void é para guardar no atributo e não retornar ou exibir
    public void setNome(String nome){
        this.nome = nome;
    }

    // Métodos getters (retornar e exibir)
    public String getNome(){
        return this.nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getCpf(){
        return this.cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}