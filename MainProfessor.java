public class Main {
    public static void main(String[] args) {
        Professor prof = new Professor("Marcos");
        Disciplina disc = new Disciplina("POO", prof);
        Estudante est = new Estudante("João", disc);

        est.mostrarInfo();
    }
}
