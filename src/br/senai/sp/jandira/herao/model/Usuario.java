package br.senai.sp.jandira.herao.model;

import java.util.Scanner;

public class Usuario {

    int a;
    int b;
    int c;
    double s;
    double area;

    public void obterLadosDoTriangulo(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("");
        System.out.print("Informe o lado \"a\" do triângulo: ");
        a = leitor.nextInt();

        System.out.print("Informe o lado \"b\" do triângulo: ");
        b = leitor.nextInt();

        System.out.print("Informe o lado \"c\" do triângulo: ");
        c = leitor.nextInt();

        realizarContas();
    }

    public void realizarContas(){
        s = (a + b + c) / 2;

        double sA = s - a;
        double sB = s - b;
        double sC = s - c;

        area = Math.sqrt(s * sA * sB * sC);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(sA);
        System.out.println(sB);
        System.out.println(sC);
        System.out.println(area);
    }
}
