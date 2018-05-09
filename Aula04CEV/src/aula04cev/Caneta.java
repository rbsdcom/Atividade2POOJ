
package aula04cev;

public class Caneta {
    public String modelo;
    private float ponta;

    public Caneta(String m, float p) {
        this.modelo = m;
        this.ponta = p;
    }
    
    public String status(){
        System.out.println("Modelo"+this.modelo);
    }
    
}
