package entitys;

import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements Domesticavel{

    public Gato(String animal, double peso){
        super(animal, peso);
    }

    @Override
    public String emitirSom() {
        int indexRandom = (int) (Math.random() * 2);
        List<String> sons = new ArrayList<>();
        sons.add("Miau-Miau");
        sons.add("Fss");

        return sons.get(indexRandom);
    }

    @Override
    public double calcularDiariaCuidado() {
        double tarifa = 40 + (0.3 * super.getPeso());
        return tarifa;
    }

    @Override
    public String interagir() {
        int indexRandom = (int) (Math.random() * 3);
        List<String> sons = new ArrayList<>();
        sons.add("Pular !!");
        sons.add("Ronronar !!");
        sons.add("Brincar !!");

        return sons.get(indexRandom);
    }

    @Override
    public boolean precisaPasseio() {
        int indexRandom = (int) (Math.random() * 2);
        return indexRandom > 1;
    }

    @Override
    public String toString() {
        return String.format("""
                Gato!!
                
                %s
                """,super.toString());
    }

}