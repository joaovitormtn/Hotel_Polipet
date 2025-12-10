package entitys;

import java.util.ArrayList;
import java.util.List;

public class Passaro extends Animal{
    private boolean raro;

    public Passaro(String nome, double peso, boolean raro){
        super(nome, peso);
        this.raro = raro;
    }
    @Override
    public String emitirSom() {
        int indexRandom = (int) (Math.random() * 3);
        List<String> sons = new ArrayList<>();
        sons.add("Piu-piu");
        sons.add("Tic-Tic");
        sons.add("Fiu-Fiu");

        return sons.get(indexRandom);
    }

    @Override
    public double calcularDiariaCuidado() {
        double tarifa = 30 + (0.1 * super.getPeso());
        if(this.raro){
            tarifa += 5;
        }
        return tarifa;
    }
    @Override
    public String toString(){
        return String.format("""
                Passaro!!
                
                Raro: %s
                %s
                """, this.raro, super.toString());
    }
}