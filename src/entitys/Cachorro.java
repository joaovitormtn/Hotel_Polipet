package entitys;

import java.util.ArrayList;
import java.util.List;

public class Cachorro extends Animal implements Domesticavel{

    public Cachorro(String nome, double peso){
        super(nome, peso);
    }

    @Override
    public String emitirSom() {
        int indexRandom = (int) (Math.random() * 2);
        List<String> sons = new ArrayList<>();
        sons.add("Au-Au");
        sons.add("Ruff-Ruff");

        return sons.get(indexRandom);
    }

    @Override
    public double calcularDiariaCuidado() {
        double tarifa = 50 + (0.5 * super.getPeso());
        if(precisaPasseio()){
            tarifa +=  10;
        }
        return tarifa;
    }

    @Override
    public String interagir() {
        int indexRandom = (int) (Math.random() * 3);
        List<String> sons = new ArrayList<>();
        sons.add("Rosnar");
        sons.add("Brincar");
        sons.add("Pular");

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
                Cachorro!!
                
                %s
                """, super.toString());
    }
}