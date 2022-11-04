package exemplos.exemplosPoo;

public class Carro extends Veiculo {
    private int portas;

    Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.portas = 2;
    }

    Carro(String marca, String modelo, int portas) {
        this.marca = marca;
        this.modelo = modelo;
        this.portas = portas;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + ", portas=" + portas + "]";
    }

    public void printStatus() {
        System.out.println(toString());
    }
}
