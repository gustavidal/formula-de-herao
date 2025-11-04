package br.senai.sp.jandira.herao;

import br.senai.sp.jandira.herao.model.Usuario;

public class Herao {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir a área do triângulo!");

        Usuario usuario = new Usuario();

        usuario.obterLadosDoTriangulo();
    }
}