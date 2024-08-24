package Atividade4;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Casa", 0.5, 30);
        Gato gato = new Gato("Mimi", 3, "Apartamento", 0.3, 5);
        Elefante elefante = new Elefante("Dumbo", 10, "Savanna", 3.0, 6000);
        Leao leao = new Leao("Simba", 8, "Savanna", 1.2, 190);
        Peixe peixe = new Peixe("Nemo", 2, "Oceano", 0.1, 1);
        Pombo pombo = new Pombo("Pombo", 1, "Cidade", 0.5, 0.3, 1);

        cachorro.comer();
        cachorro.moverse();
        cachorro.dormir();

        gato.comer();
        gato.moverse();
        gato.dormir();

        elefante.comer();
        elefante.moverse();
        elefante.dormir();

        leao.comer();
        leao.moverse();
        leao.dormir();

        peixe.comer();
        peixe.moverse();
        peixe.dormir();
        peixe.nadar();

        pombo.comer();
        pombo.moverse();
        pombo.dormir();
        pombo.voar();
    }
}
