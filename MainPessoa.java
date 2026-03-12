public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ana");
        Pessoa p2 = new Pessoa("Carlos");

        p1.adicionarAmigo(p2);
        p1.mostrarAmigo();
    }
}
