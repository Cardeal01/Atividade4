package Atividade4;

public class Peixe extends AnimalMarinhoAB {

    public Peixe(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Peixe", idade, habitat, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo algas.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta nadando.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo em movimento.");
    }

    @Override
    public void nadar() {
        System.out.println(nome + " esta nadando rapidamente.");
    }
}
