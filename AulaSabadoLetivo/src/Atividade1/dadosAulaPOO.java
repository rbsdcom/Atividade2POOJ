
package Atividade1;


public class dadosAulaPOO 
{    
    String nome;
    double notaBimestral1;
    double notaBimestral2;
    
    double media(){
        return (notaBimestral1 + notaBimestral2) /2;
    }    
    double mediaPonderada(){
       return ((notaBimestral1*4) + (notaBimestral2*6)) /10;  
    }
    
    String situacaoAluno(double mediaPonderada){          
      if(mediaPonderada>=6){
       return "Aprovado\n";
      }
      else{
         return "Reprovado\n";
      }
    }
    
    String retornaDados(){
        return "Nome: "+nome+ "\nMedia: " +media()+ "\nMedia Ponderada: " +mediaPonderada()+ 
                "\nSituacao: " +situacaoAluno(mediaPonderada());
    }
    
}
