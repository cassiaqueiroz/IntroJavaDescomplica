//nome da classe
class PrimeiroProgramaJava {

//módulo principal com a entrada pela linha de comando
public static void main (String entrada[]){

//declaração de variáveis
int inteiro = 33;
char genero= 'N';
double real = 1.56;
String nome = "Cássia Queiroz";
boolean descomplica = true;

if (descomplica == true && genero == 'N'){
System.out.println("Eu sou " + nome + ", tenho " + inteiro + " anos e " + real + "m de altura.");

}
//para fechar o programa:
System.exit(0);
}
}