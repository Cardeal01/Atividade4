package Atividade4;

public class Elefante extends AnimalAB {

    public Elefante(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Elefante", idade, habitat, 4, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo folhas.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta caminhando lentamente.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo de pe.");
    }
}
