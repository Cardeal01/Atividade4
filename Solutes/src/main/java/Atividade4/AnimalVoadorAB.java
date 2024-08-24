package Atividade4;

public abstract class AnimalVoadorAB extends AnimalAB {
    protected double envergaduraAsa;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, double envergaduraAsa, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, 2, altura, peso); // Voador, geralmente com 2 patas
        this.envergaduraAsa = envergaduraAsa;
    }

    public abstract void voar();
}