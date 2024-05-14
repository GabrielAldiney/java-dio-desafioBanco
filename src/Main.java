public class Main {
    public static void main(String[] args) {
        // Criação de clientes de A a Z
        for (char letra = 'A'; letra <= 'Z'; letra++) {
            Cliente cliente = new Cliente();
            cliente.setNome(String.valueOf(letra));

            Conta cc = new ContaCorrente(cliente);
            Conta poupanca = new ContaPoupanca(cliente);

            cc.depositar(100);
            cc.transferir(100, poupanca);

            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
    }
}
