package Atividade4;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, int idade, String habitat, double envergaduraAsa, double altura, double peso) {
        super(nome, "Pombo", idade, habitat, envergaduraAsa, altura, peso);
    }

    @Override
    public void comer() {
        System.out.println(nome + " esta comendo graos.");
    }

    @Override
    public void moverse() {
        System.out.println(nome + " esta andando.");
    }

    @Override
    public void dormir() {
        System.out.println(nome + " esta dormindo no ninho.");
    }

    @Override
    public void voar() {
        System.out.println(nome + " esta voando alto.");
    }
}
