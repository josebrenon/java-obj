package aula01;

import java.util.Scanner;

public class PessoaApp {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa1: ");
        String nome = entrada.next(); //JOptionPane.showInputDialog("Digite o nome para a pessoa1");

        Pessoa pessoa1 = new Pessoa(1, nome);
        Pessoa pessoa2 = new Pessoa(2, "Ana");
               
        pessoa2.setNome("Julia");
        
        System.out.println("O nome do objeto pessoa1 é: "+pessoa1.getNome());
        System.out.println("O nome do objeto pessoa2 é: "+pessoa2.getNome());
    }
}
