package Atividade4;

public abstract class AnimalMarinhoAB extends AnimalAB {
    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, double altura, double peso) {
        super(nome, tipoAnimal, idade, habitat, 0, altura, peso); // Marinho, sem patas
    }

    public abstract void nadar();
}
