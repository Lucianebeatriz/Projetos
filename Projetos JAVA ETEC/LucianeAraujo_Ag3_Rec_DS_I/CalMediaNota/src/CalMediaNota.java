import java.util.Scanner;
public class CalMediaNota {
    public static void main (String[] args) {
        //Criação de objeto Scanner para entrada de dados
        Scanner scanner = new Scanner (System.in);
          //Declaração das variáveis
        double nota1, nota2, media;
        String nome, telefone, serie;
         //Solicitação de leitura dos dados solicitados
        System.out.println ("Qual o nome do aluno?");
        nome = scanner.next();
        System.out.println ("Qual o telefone?");
        telefone = scanner.next();
        System.out.println ("Qual a série?");
        serie = scanner.next();
        System.out.println ("Qual a nota da primeira prova?");
        nota1 = scanner.nextDouble();
        System.out.println ("Qual a nota da segunda prova?");
        nota2 = scanner.nextDouble();
          //Cálculos a serem realizados
        media = (nota1 + nota2)/2;
        //Exibição dos resultados
        System.out.println ("\n Resultado");
        System.out.println ("------ Técnico em Informática EaD ------");
        System.out.println ("Nome:" + nome);
        System.out.println ("Telefone:" + telefone);
        System.out.println ("Série:" + serie);
        System.out.println ("----------------------------");
        System.out.println ("Média:" + media);

    }
}
