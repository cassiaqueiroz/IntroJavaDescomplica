import javax.swing.*;

public class DecisaoComRepeticao02 {
    public static void main(String[] args) {
        /*
         * note que diferente da soma no arquivo "DecisaoComRepeticao", multiplicação
         * começa com 1 e não zero:
         */
        int n1, n2, multi = 1;
        char op = 0;
        String msg = "", msgEntra = "Digite 1 para multiplicação; \n Digite 2 para potenciação. \n";

        // Entrada de dados
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro:"));
        op = (JOptionPane.showInputDialog(msgEntra)).charAt(0);

        // Processamento
        switch (op) {
            case '1': {
                if (n1 > 0 && n2 > 0) {
                    multi = n1 * n2;
                    msg = msg + n1 + " * " + n2 + " = " + multi + ". \n";
                }
                break;
            }
            case '2': {
                for (int i = 1; i <= n2; i++) {
                    multi = multi * n1;
                }
                msg = msg + n1 + " multiplicado por ele mesmo " + n2 + " vezes = " + multi + ". \n";
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