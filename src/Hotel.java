import entitys.*;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Animal> animais;

    public Hotel(){
        this.animais = new ArrayList<>();
        popularBanco();
    }

    private void popularBanco(){
        String[] nomes = {"Rex", "Pepe", "Lucius", "Romeu", "Roberto", "Cicero", "Nego", "Lake", "R"};

        for(String nome : nomes){
            int sorteio = (int) (Math.random() * 3 + 1);
            switch (sorteio){
                case 1:
                    double gRandom = (Math.random() * 20 + 5);
                    Gato g = new Gato(nome, gRandom);
                    animais.add(g);
                    break;
                case 2:
                    double cRandom = (Math.random() * 30 + 10);
                    Cachorro c = new Cachorro(nome, cRandom);
                    animais.add(c);
                    break;
                case 3:
                    double pRandom = (Math.random() * 5 + 1);
                    boolean raro = pRandom > 3;
                    Passaro p = new Passaro(nome, pRandom, raro);
                    animais.add(p);
                    break;
                default:
                    break;
            }
        }
    }

    public String listar(){
        StringBuilder sb = new StringBuilder();
        for (Animal a : this.animais){
            sb.append(a.toString())
                    .append("\n")
                    .append("-------------------")
                    .append("\n");
        }

        return sb.toString();
    }

    public double somar(){
        double total = 0;
        for (Animal a : this.animais){
            total += a.calcularDiariaCuidado();
        }
        return total;
    }

    public List<Domesticavel> filtrar(){
        List<Domesticavel> domesticaveis = new ArrayList<>();
        for (Animal a: this.animais){
            if(a instanceof Domesticavel){
                domesticaveis.add((Domesticavel) a);
            }
        }
        return domesticaveis;
    }
}