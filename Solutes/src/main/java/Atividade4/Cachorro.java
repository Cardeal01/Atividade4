package Atividade4;

public class Cachorro extends AnimalAB {

    public Cachorro(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Cachorro", idade, habitat, 4, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo raçao.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta correndo.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo na casinha.");
    }
}