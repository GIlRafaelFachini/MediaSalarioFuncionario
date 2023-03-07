public class Main {

    public static void main(String[] args) {

        Funcionario funcionario1  = new Funcionario("Gil",25, new double[]{1200,1500,1300});
        Funcionario funcionario2  = new Funcionario("Evy",24, new double[]{1700,1800,1400});

        funcionario1.imprimir();
        funcionario2.imprimir();
    }
}
