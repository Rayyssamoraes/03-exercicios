package exercicio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pacientes paciente = new Pacientes();
        double[] alvo = paciente.frequenciaAlvo();

        System.out.println("");

        System.out.print("Nome Completo --> ");
        paciente.nome = sc.nextLine();
        System.out.print("Idade --> ");
        paciente.idade = sc.nextInt();

        System.out.println("");

        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Frequência Máxima: " + paciente.frequenciaMaxima());
        System.out.println("Frequência Alvo [" + alvo[0] + "," + alvo[1] + "]");

    }//main
}//Main
