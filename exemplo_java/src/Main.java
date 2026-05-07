import classes.Pessoa;
import classes.Funcionario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean painel = true;

        while (painel){
            System.out.println("---------------------------");
            System.out.println("1. Exemplo(Classe Pessoa):\n2. Exercicio(Classe Funcionario):\n3. Encerrar:");
            System.out.println("---------------------------");
            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op){
                case 1:
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
                    break;
                case 2:
                    for (int i = 0; i < 5; i++){
                        Funcionario f1 = new Funcionario();


                        System.out.println("Nome do funcionario " + (i+1)+ ":");
                        f1.setNome(scanner.nextLine());
                        System.out.println("Aniversario do funcionario" + (i+1)+ ":");
                        System.out.println("Dia/Mes/Ano:");
                        int dia = scanner.nextInt();
                        int mes = scanner.nextInt();
                        int ano = scanner.nextInt();
                        LocalDate data = LocalDate.of(ano, mes, dia);
                        f1.setAniversario(data);
                        System.out.println("Salario do funcionario" + (i+1)+ ":");
                        f1.setSalario(scanner.nextDouble());
                        scanner.nextLine();
                        if (f1.getSalario() >= 5000){
                            f1.bonus();
                        } else {
                            f1.desconto();
                        }

                        System.out.println(f1.imprimir());
                    }
                    break;
                case 3:
                    System.out.println("Obrigado por usar o sistema!!");
                    painel = false;
                    break;
            }
        }





    }
}