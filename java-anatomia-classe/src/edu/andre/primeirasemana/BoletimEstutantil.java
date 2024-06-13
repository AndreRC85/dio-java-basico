package edu.andre.primeirasemana;
public class BoletimEstutantil {
    public static void main(String[] args) {
        int mediaFinal = 8;
        if(mediaFinal < 6)
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Prova Minerca");
        else if (mediaFinal > 6)
            System.out.println("APROVADO");
    }
}