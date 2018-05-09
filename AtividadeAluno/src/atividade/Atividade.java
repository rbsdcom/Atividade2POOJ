
package atividade;


public class Atividade {
    float salario;
    
    float CalcHr(){ //Calculo valor da hora trabalhada no mes
        return salario / 44 ;
    }
    
    float soma(int n1, float CalcHr)
    {
        return n1+CalcHr;
    }
    public static void main(String[] args) 
    {/*
        Aluno AlunoI = new Aluno();
        AlunoI.nome = "Rogerio";
        AlunoI.notaBimestral1 = 6.5f;
        AlunoI.notaBimestral2 = 7.5f;
        AlunoI.Media();
        AlunoI.Ponderada();
        AlunoI.Situacao();
        
        Aluno AlunoII = new Aluno();
        AlunoII.nome = "Jose";
        AlunoII.notaBimestral1 = 5f;
        AlunoII.notaBimestral2 = 5.5f;
        AlunoII.Media();
        AlunoII.Ponderada();
        AlunoII.Situacao();
        */
        Atividade s = new Atividade();
        s.salario = 500;
        System.out.println(s.soma(1, s.salario));
        
    }
   
    
}
