package Atividade4;

public abstract class AnimalAB implements AnimalIF {
    protected String nome;
    protected String tipoAnimal;
    protected int idade;
    protected String habitat;
    protected int quantidadeDePatas;
    protected double altura;
    protected double peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeDePatas, double altura, double peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.quantidadeDePatas = quantidadeDePatas;
        this.altura = altura;
        this.peso = peso;
    }


    public abstract void comer();
    public abstract void moverse();
    public abstract void dormir();
}
