package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Funcionario {
    private String nome;
    private double salario;
    private LocalDate aniversario;

    public Funcionario(String nome, LocalDate aniversario, double salario) {
        this.nome = nome;
        this.aniversario = aniversario;
        this.salario = salario;
    }

    public Funcionario() {
        this.nome = "";
        this.aniversario = LocalDate.of(1000, 1, 1);
        this.salario = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public LocalDate getAniversario() {
        return aniversario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void desconto() {
        double desconto = this.salario * 0.03;
        this.salario -= desconto;
    }

    public void bonus() {
        double bonus = this.salario * 0.05;
        this.salario += bonus;
    }

    public String imprimir(){

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Nome: " + this.nome + "\nAniversario: " + this.aniversario.format(formatador) + "\nSalario: " + this.salario;
    }
}


