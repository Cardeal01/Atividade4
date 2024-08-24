package Atividade4;

public class Leao extends AnimalAB {

    public Leao(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Leão", idade, habitat, 4, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo carne.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta correndo na savana.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo na sombra.");
    }
}
