package br.senai.sp.jandira.herao.model;

import java.util.Scanner;

public class Usuario {

    int a;
    int b;
    int c;
    int s;

    public void obterLadosDoTriangulo(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("");
        System.out.print("Informe o lado \"a\" do triângulo: ");
        a = leitor.nextInt();

        System.out.print("Informe o lado \"b\" do triângulo: ");
        b = leitor.nextInt();

        System.out.print("Informe o lado \"c\" do triângulo: ");
        c = leitor.nextInt();
    }
}
