import classes.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 20; i++ ){

            Pessoa p1 = new Pessoa();
            System.out.println("Digite o nome da pessoa " + (i+1));
            p1.setNome(scanner.next());
            System.out.println("Digite a idade da pessoa " + (i+1));
            p1.setIdade(scanner.nextInt());
            System.out.println("Digite o salario da pessoa " + (i+1));
            p1.setSalario(scanner.nextDouble());
            System.out.println(p1.imprimir());

        }
    }
}