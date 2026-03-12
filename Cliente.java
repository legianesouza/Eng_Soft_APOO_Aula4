class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
}

class ContaBancaria {
    int numero;
    Cliente cliente;

    public ContaBancaria(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void mostrarTitular() {
        System.out.println("Conta: " + numero);
        System.out.println("Titular: " + cliente.nome);
    }
}
