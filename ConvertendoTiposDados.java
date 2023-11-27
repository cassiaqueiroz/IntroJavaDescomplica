class ConvertendoTiposDados {

    public static void main(String entrada[]) {

        int numInt;
	double numReal, multiply;
	char caracter;

        // Entrada de dados
        numInt = Integer.parseInt(entrada[0]);
        numReal = Double.parseDouble(entrada[1]);
	caracter = (entrada[2]).charAt(0);

        // Processamento
        multiply = (double)numInt * numReal;
//acima numInt foi convertido para tipo double

        System.out.println((double)numInt + " * " + numReal + " = " + multiply + " sinal " + caracter);

        System.exit(0);
    }
}
