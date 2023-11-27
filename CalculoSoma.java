//Esse precisa ser rodado no terminal depois de javac CalculoSoma.java
//Lembrando que devemos usar o terminal quando estivermos dentro da pasta certa
//A pasta certa é onde está o arquivo.java que escrevemos
//É preciso escrever java CalculoSoma n1 n2 
//Substituímos n1 e n2 pelos números desejados

class CalculoSoma {

    public static void main(String entrada[]) {

        int n1, n2, soma;

        // Entrada de dados
        n1 = Integer.parseInt(entrada[0]);
        n2 = Integer.parseInt(entrada[1]);

        // Processamento
        soma = n1 + n2;

        System.out.println(n1 + " + " + n2 + " = " + soma);

        // Para fechar o programa:
        System.exit(0);
    }
}
