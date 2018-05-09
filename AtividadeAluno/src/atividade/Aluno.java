package atividade;

public class Aluno 
{
    String nome;
    float notaBimestral1;
    float notaBimestral2;

    void Media() 
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Media: " + (notaBimestral1 + notaBimestral2) / 2);
    }

    void Ponderada() 
    {
        System.out.println("Media Ponderada: " + ((notaBimestral1 * 4) + (notaBimestral2 * 6)) / 10);
    }

    void Situacao() 
    {
        if ((((notaBimestral1 * 4) + (notaBimestral2 * 6)) / 10) > 6) {
            System.out.println("Aprovado \n");
        } else {
            System.out.println("Reprovado \n");
        }
    }
}
