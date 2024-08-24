package Atividade4;

public class Gato extends AnimalAB {

    public Gato(String nome, int idade, String habitat, double altura, double peso) {
        super(nome, "Gato", idade, habitat, 4, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo peixe.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta andando silenciosamente.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo no sofa.");
    }
}
