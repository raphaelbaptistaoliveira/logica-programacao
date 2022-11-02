package exemplos.exemplosPoo;

public class Carro {
   private String marca;
   private String modelo;
   private int velocidade;

    Carro (String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        velocidade=0;
    }

    void acelerar(int velo){
        System.out.println("Acelerando");
        velocidade = velocidade+velo;
        if(velocidade>=200){
            velocidade=200;
            System.out.println("Velocidade Maxima atingida foi: " + velocidade + " Km/h.");
        }else {
			System.out.println("Velocidade atual é: " + velocidade + " Km/h.");
		}
    }
    void frear(int tirarvelo){
        System.out.println("Freiando");
        velocidade = velocidade-tirarvelo;
        if(velocidade<=0){
            velocidade=0;
            System.out.println("Velocidade minima atingida é: " + velocidade + " Km/h.");
        } else {
			System.out.println("Velocidade atual é: " + velocidade + " Km/h.");
		}
        
    }
    @Override
    public String toString() {
        return "Carro [marca="+this.marca+", modelo="+this.modelo+", velocidade="+velocidade+"]";
    }

    public void printStatus() {
		System.out.println(toString());
    }
}
