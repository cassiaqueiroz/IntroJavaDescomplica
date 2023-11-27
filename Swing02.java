import javax.swing.*;

public class Swing02 {
    public static void main(String entrada[]) {
        //note que acima, a prof não usa args, não precisa. Podemos escolher outro nome

        // Declaração de variáveis
        int n1, n2, div;
        double pot;
        //Essa string vai ajudar a organizar as mensagens em apenas um System.out.println
        String msg = "";

        // Entrada
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));

        // Processamento
        div = (int)n1 / (int)n2;
        pot = Math.pow(n1,n2);

        // Saída de resultados
        msg = msg + "Divisão entre " + n1 + " por " + n2 + " = " + div + ";\n";
        msg = msg + "Potência de " + n1 + " elevado a " + n2 + " = " + pot + ".";
        JOptionPane.showMessageDialog(null, msg);

        System.out.println(msg);
        System.exit(0);

    }
}
