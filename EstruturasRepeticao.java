import javax.swing.*;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        int tabuada;
        char op = 0;
        String msg = "",
                msgEnter = "Digite '1' repetição for;\nDigite '2' para repetição while;\nDigite '3' para repetição do-while.";

        // Entrada de dados
        tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
        op = (JOptionPane.showInputDialog(msgEnter)).charAt(0);

        // Processamento
        switch (op) {
            case '1': {
                msg = msg + "Tabuada do " + tabuada + " utilizando 'for' :\n";
                for (int i = 1; i < 11; i++) {
                    msg = msg + tabuada + " * " + i + " = " + tabuada * i + "\n";
                }
                break;
            }
            case '2': {
                msg = msg + "Tabuada do " + tabuada + " utilizando 'while' :\n";
                int i = 1;
                while (i < 11) {
                    msg = msg + tabuada + " * " + i + " = " + tabuada * i + "\n";
                    i++;
                }
                break;
            }
            case '3': {
                msg = msg + "Tabuada do " + tabuada + " utilizando 'do-while' :\n";
                int i = 1;
                do {
                    msg = msg + tabuada + " * " + i + " = " + tabuada * i + "\n";
                    i++;
                } while (i < 11);
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida. Escolha entre 1, 2 e 3.");
        }

        // Saída de dados
        if (op >= '1' && op <= '3') {
            JOptionPane.showMessageDialog(null, msg);
        }
        System.exit(0);
    }
}
