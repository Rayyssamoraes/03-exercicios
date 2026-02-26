package exercicio02;

public class Pacientes {

    String nome;
    int idade;

    public int frequenciaMaxima(){
        return 220 - idade;
    }//frequenciaMaxima

    public double[] frequenciaAlvo(){
        double[] alvo = new double[2];
        int fm = frequenciaMaxima();
        alvo[0] = fm * 0.50;
        alvo[1] = fm * 0.85;
        return alvo;
    }//frequenciaAlvo

}//Pacientes
