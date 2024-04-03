import java.util.Scanner;

import javax.swing.JOptionPane;
public class Sistema_Desconto {
    public static void main (String[]args) {
      //Criação de objeto Scanner para entrada de dados
      Scanner leitor = new Scanner (System.in);
      //Declaração das variáveis
      double valor_compra, desconto, valor_atualizado;
      String aux;
      //Solictação de leitura dos dados solicitados
      aux =JOptionPane.showInputDialog("Qual o valor da compra?");
      valor_compra = Double.parseDouble(aux);
      //Processamento e saída
      if (valor_compra<200) {
      //Cálculo
      desconto = valor_compra*0.05;
      valor_atualizado = valor_compra - desconto;
      JOptionPane.showMessageDialog(null, "O desconto foi de 5% R$" +desconto);
      JOptionPane.showMessageDialog(null, "O valor com o desconto é de R$" +valor_atualizado);
      }
      if (valor_compra>=200 && valor_compra<300) {
        desconto = valor_compra*0.10;
      valor_atualizado = valor_compra - desconto;
      JOptionPane.showMessageDialog(null, "O desconto foi de 10% R$" +desconto);
      JOptionPane.showMessageDialog(null, "O valor com o desconto é de R$" +valor_atualizado);
      }
      if (valor_compra>=300) {
        desconto = valor_compra*0.15;
      valor_atualizado = valor_compra - desconto;
      JOptionPane.showMessageDialog(null, "O desconto foi de 15% R$" +desconto);
      JOptionPane.showMessageDialog(null, "O valor com o desconto é de R$" +valor_atualizado);
      }
    }
}
