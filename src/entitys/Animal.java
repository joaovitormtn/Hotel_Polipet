package entitys;

public abstract class Animal {
    private String nome;
    private double peso;

    public Animal(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String emitirSom();
    public abstract double calcularDiariaCuidado();

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Peso: %.2f Kg
                """, this.nome, this.peso);
    }
}