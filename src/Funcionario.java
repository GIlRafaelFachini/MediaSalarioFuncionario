import java.util.Arrays;
import java.util.StringJoiner;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimir(){
        System.out.println("NOME:" + this.nome);
        System.out.println("IDADE:" + this.idade);
        for(double salario : salarios){
            System.out.println("SALARIO: " + salario);
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        double media = 0;
        for(double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
        System.out.println("-----------------------------------------");
    }

    public Funcionario(String nome, int idade, double[] salarios) {
        this.nome = nome;
        this.idade =  idade;
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Funcionario.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .add("idade=" + idade)
                .add("salario=" + Arrays.toString(salarios))
                .toString();
    }
}
