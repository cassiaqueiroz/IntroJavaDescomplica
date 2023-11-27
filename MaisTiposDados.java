class MaisTiposDados {

    public static void main(String entrada[]) {

    int num1, num2, mod, div;
	double raiz, pot;
	String msg = "";

        // Entrada de dados
        num1 = Integer.parseInt(entrada[0]);
        num2 = Integer.parseInt(entrada[1]);

        // Processamento
        mod = num1 % num2;
		div = (int)num1 / (int)num2;
		raiz = Math.sqrt(num1);
		pot = Math.pow(num1,num2);
	
		//Saída de resultados
		msg = "num1 = " + num1 + " num2 =  " + num2 + "\n";
		msg = msg + "resto da div de num1 por num2 = " + mod + "\n";
		msg = msg + "quociente da div de num1 por num2 = " + div + "\n";
		msg = msg + "raiz quadrada de num1= " + raiz + "\n";
		msg = msg + "potência de num1 elevado a num2 = " + pot + "\n";
			System.out.println(msg);
			System.exit(0);
    }
}
