
package Atividade2;


public class Pessoas 
{
    String nome;
    String escolaridade;
    String sexo;
    int idade;


    
    void perfilcandidato(String nome, String escolaridade, int idade)
    {
        if (sexo == "M" && idade > 40 && escolaridade == "fundamental") {
            System.out.println( "Servente\n");
        } else if (sexo == "F" && idade < 25 && escolaridade == "medio") {
            System.out.println( "Recepcionista\n");
        } else if ((sexo == "F" || sexo == "M") && idade > 30 && escolaridade == "superior") {
            System.out.println( "Auxiliar de RH \n");
        } else {
            System.out.println("Nenhuma profissao se encaixa no seu perfil \n");
        }
    }
    
    String retornaDados(){
        return "Nome : "+nome+ "\nIdade: "+idade+ "\nSexo : "+sexo;
    }
    
 
    public static void main(String[] args) {
     Pessoas pe = new Pessoas();
        pe.nome = "maria";
        pe.idade = 30;
        pe.escolaridade = "medio";
        pe.sexo = "F";
        
        System.out.println(pe.retornaDados());
        pe.perfilcandidato(pe.nome, pe.escolaridade, pe.idade);
    }
    
}
