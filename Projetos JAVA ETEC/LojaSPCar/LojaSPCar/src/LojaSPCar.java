import java.util.Scanner;
public class LojaSPCar {
    public static void main(String[] args) {
        //Criação de objeto Scanner para entrada de dados
        Scanner leitor = new Scanner (System.in);
        //Declaração das variáveis
        double diaria, dias, km, total;
        String modelo;
        //Solicitação de leitura dos dados solicitados
        System.out.println("Qual o modelo do carro?");
        modelo = leitor.next();
        System.out.println("Qual o valor da diária?");
        diaria = leitor.nextDouble();
        System.out.println("Quantos dias de aluguel?");
        dias = leitor.nextDouble();
        System.out.println("Quantos km percorridos?");
        km = leitor.nextDouble();
        //Cálculos a serem realizados
        total = (km * 0.20) + (dias * diaria);

        //Exibição dos resultados
        System.out.println("\n Resultados");
        System.out.println("O modelo escolhido foi:" + modelo);
        System.out.println("O valor total é de R$:" + total);

    }
}
