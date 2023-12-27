import javax.swing.*;

public class Matriz {
  public static void main(String[] args) {
    int vetor[] = { 2, 4, 6, 8, 10 };
    int matriz[][] = new int[2][3];
    String msg = "vetor: ";

    // Vetor:
    for (int i = 0; i < vetor.length; i++) {
      msg = msg + vetor[i] + " ";
    }

    JOptionPane.showMessageDialog(null, msg);

    msg = "Matriz: \n";

    // 'For' para cada linha
    for (int i = 0; i < matriz.length; i++) {
      // Para cada linha, agora fazemos um 'for' para inserir as colunas:
      for (int j = 0; j < matriz[0].length; j++) {
        matriz[i][j] = Integer
            .parseInt(JOptionPane.showInputDialog("Digite um inteiro para a posição " + i + " e " + j));
        msg = msg + matriz[i][j] + " ";
      }
      /*
      Após preencher todas as colunas de uma linha, 
      é adicionada uma quebra de linha à string msg.
      */
      msg = msg + "\n";
    }

    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}