
package cursoemvideoi;

public class CVAula {

    public static void main(String[] args) 
    {
        CVAulaII caneta = new CVAulaII();
        caneta.modelo="BIc ";
        caneta.cor="Azul";
        //caneta.ponta = 0.5f;
        caneta.carga=80;
        caneta.tampar();
        //caneta.destampar();
        caneta.status();
        caneta.rabiscar();
        
        
    }
   
}
