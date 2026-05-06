package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private double salario;

    public Pessoa() {
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String imprimir(){
        String mensagem = "Nome: " + this.nome;
        if (this.idade > 18) {
            mensagem += "\nIdade: " + this.idade;
        }
        mensagem+="\nSalario: R$" + this.salario;
        return mensagem;
    }

}
