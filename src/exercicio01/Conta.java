package exercicio01;

public class Conta {

    String correntista;
    int numero;
    double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
    }//depositar

    public void sacar(double valor){
        saldo = saldo - valor;
    }//sacar

}//conta
