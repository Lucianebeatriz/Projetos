import java.util.Scanner;
public class Pesquisa_Opinião {
    public static void main(String[] args) {
        //Criação de objeto Scanner para entrada de dados
        Scanner leitor = new Scanner (System.in);
        String nome, idade;
        int totalexcelente = 0;
        int totalbom = 0;
        int totalruim = 0;
        for (int i = 0; i < 10; i++) {
 //Solicitação de leitura dos dados solicitados
 System.out.println("Qual o seu nome?");
 nome = leitor.nextLine();
 System.out.println("Qual a sua idade?");
 String idade = leitor.nextLine();
 System.out.println("Qual a nota pelo atendimento prestado? (1-EXCELENTE, 2-BOM, 3-RUIM)");
 int opiniao = leitor.nextInt();
  switch (opiniao) {
    case 1:
        totalexcelente++;
        break;
    case 2:
        totalbom++;
        break;
    case 3:
        totalruim++;
        break;
            }
            System.out.println("**Resultados da Pesquisa**");
            System.out.println("Total de respostas 'EXCELENTE': " + totalexcelente);
            System.out.println("Total de respostas 'BOM': " + totalbom);
            System.out.println("Total de respostas 'RUIM': " + totalruim); 

        }    
    }
}