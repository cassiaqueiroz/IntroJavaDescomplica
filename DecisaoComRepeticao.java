import javax.swing.*;

public class DecisaoComRepeticao {
    public static void main(String[] args) {
        int n1, n2, soma = 0;
        char op = 0;
        String msg = "", msgEntra = "Digite 1 para adição; \n Digite 2 para somatório. \n";

        // Entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro par:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro par:"));
        op = (JOptionPane.showInputDialog(msgEntra)).charAt(0);

        // Processamento
        switch (op) {
            case '1': {
                if (n1%2 == 0 && n2%2 == 0) {
                    soma = n1 + n2;
                    msg = msg + n1 + " + " + n2 + " = " + soma + ". \n";
                }
                break;
            }
            case '2': {
                for (int i = 1; i <= n2; i++) {
                    soma = soma + n1;
                }
                msg = msg + n1 + " somado " + n2 + " vezes = " + soma + ". \n";
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida.");
        }

        // Saída de dados
        if (op >= '1' && op <= '2') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}