public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente("Maria");
        ContaBancaria conta = new ContaBancaria(1234, c);

        conta.mostrarTitular();
    }
}
