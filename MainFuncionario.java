public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("LegiTech Ltda");

        emp.adicionarFuncionario(new Funcionario("Ana"));
        emp.adicionarFuncionario(new Funcionario("Pedro"));

        emp.listarFuncionarios();
    }
}
