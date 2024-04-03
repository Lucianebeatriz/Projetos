import java.util.Scanner;
public class CalculadoraLuciane {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
            double numero1, numero2, soma,sub, mult, div;
            System.out.println("Digite o primeiro valor");
            numero1 = leitor.nextDouble();
            System.out.println("Digite o segundo valor");
            numero2 = leitor.nextDouble();
            soma = numero1 + numero2;
            sub = numero1 - numero2;
            mult = numero1 * numero2;
            div = numero1 / numero2;
        
        System.out.println("\nResultados");
        System.out.println("A soma dos valores digitados é:" + soma);
        System.out.println(" A subtração dos valores digitados é:" + sub);
        System.out.println(" A multiplicação dos valores digitados é:" + mult);
        System.out.println(" A divisão dos valores digitados é:" + div);
       
    }
}
