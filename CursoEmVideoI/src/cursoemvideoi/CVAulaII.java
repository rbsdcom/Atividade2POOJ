
package cursoemvideoi;


public class CVAulaII {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("POnta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Esta tampada? "+this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true ){
            System.out.println("Erro: nao pode rabiscar");
         
        }
        else
        {
            System.out.println("rabiscando");
        }
    }
    
    public void tampar(){
        this.tampada=true;
    }
    
    public void destampar(){
        this.tampada=false;
    }
}
