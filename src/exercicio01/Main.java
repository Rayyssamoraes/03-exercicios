package exercicio01;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        double valor;

        System.out.println("");

        System.out.print("<-- Correntista --> ");
        conta.correntista = sc.next();
        conta.numero = rd.nextInt(1000, 9999);

        System.out.println("");

        System.out.println("Saldo Inicial R$ " + df.format(conta.saldo));
        System.out.print("Valor para Depósito R$: ");
        valor = sc.nextDouble();
        conta.depositar(valor);

        System.out.println("");

        System.out.println("Saldo Atual R$ " + df.format(conta.saldo));
        System.out.print("Valor para Saque R$: ");
        valor = sc.nextDouble();
        conta.sacar(valor);

        System.out.println("");

        System.out.println("Saldo Atual R$ " + df.format(conta.saldo));

    }//main
}//Main
