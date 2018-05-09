package Atividade1;

public class AulaPOO 
{
    public static void main(String[] args) 
    {
        dadosAulaPOO objAula = new dadosAulaPOO();
        objAula.nome = "Joao";
        objAula.notaBimestral1 = 8;
        objAula.notaBimestral2 = 5;
        System.out.println(objAula.retornaDados());        
        
        dadosAulaPOO objAulaII = new dadosAulaPOO();
        objAulaII.nome = "Maria";
        objAulaII.notaBimestral1 = 6;
        objAulaII.notaBimestral2 = 5;
        System.out.println(objAulaII.retornaDados());        
           
    }    
}
