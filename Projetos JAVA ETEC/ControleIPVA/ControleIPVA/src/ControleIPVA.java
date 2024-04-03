import java.util.Scanner;

import javax.swing.JOptionPane;
public class ControleIPVA {
    public static void main (String[]args) {
        //declaração de variáveis
        int digito;

        //entrada e conversão de dados
        digito = Integer.parseInt(JOptionPane.showInputDialog("Informe o último digito da placa"));
        //processamento dos dados
        switch (digito) {
            case 1:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 30/04");
            break;
            case 2:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/05");
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 30/06");
            break;
            case 4:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/07");
            break;
            case 5:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/08");
            break;
            case 6:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 30/09");
            break;
            case 7:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/10");
            break;
            case 8:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 30/11");
            break;
            case 9:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/12");
            break;
            case 0:
            JOptionPane.showMessageDialog(null, "O pagamento deve ser realizado até o dia 31/12");
            break;
            default:
            JOptionPane.showMessageDialog(null, "O digito informado não é válido");
            break;

        }
    }
}
