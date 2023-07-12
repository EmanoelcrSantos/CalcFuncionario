package application;

import funcionario.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.println("Olá, digite o nome do funcionário: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Informe o sálario bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.println("Informe a taxa de imposto: ");
        funcionario.imposto = sc.nextDouble();
        System.out.println();

        double salarioLiquido = funcionario.salarioLiquido();
        System.out.printf("Funcionário: " + funcionario);
        System.out.println();
        System.out.println("Qual a porcentagem de aumento? ");
        double porcentagem = sc.nextDouble();
        funcionario.aumentoSalario(porcentagem);
        System.out.printf("Salário atualizado: " + funcionario);

        sc.close();
    }
}
