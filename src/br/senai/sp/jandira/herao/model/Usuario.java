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

        validarTrianguloReal();
    }

    public void validarTrianguloReal(){
        System.out.println("");
        System.out.println("Vamos verificar se o triângulo é real:");

        System.out.println(a + " + " + b + " > " + c + " -> " + (a + b) + " > " + c);
        System.out.println(b + " + " + c + " > " + a + " -> " + (b + c) + " > " + a);
        System.out.println(c + " + " + a + " > " + b + " -> " + (c + a) + " > " + b);
        System.out.println("");

        if ((a + b) > c && (b + c) > a && (c + a) > b){
            System.out.println("Os valores informados fazem um triângulo real.");
            realizarContas();
        } else if (((a + b) < c || (b + c) < a || (c + a) < b)){
            System.out.println("Os valores informados não fazem um triângulo real!");
            System.out.println("Sem solução!");
        }
    }

    public void realizarContas(){
        s = (a + b + c) / 2;

        double sA = s - a;
        double sB = s - b;
        double sC = s - c;

        area = Math.sqrt(s * sA * sB * sC);

        exibirResultados();
    }

    public void exibirResultados(){
        String areaDec = String.format("%.2f", area);

        System.out.println("");
        System.out.println("-------------------------------------");
        System.out.println("Lado a: " + a);
        System.out.println("Lado b: " + b);
        System.out.println("Lado c: " + c);
        System.out.println("-------------------------------------");
        System.out.println("Área aproximada do triângulo: " + areaDec);
        System.out.println("-------------------------------------");
    }
}
