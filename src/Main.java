public class Main {

    public static void main(String[] args) throws ExcecaoDeNegocios {
        Cliente rodrigo = new Cliente("Rodrigo",
            "Rua NeverLand",
            "999999999");

        ContaCorrente cc = new ContaCorrente(rodrigo);
        cc.depositar(100.00);

        ContaPoupanca poupanca = new ContaPoupanca(rodrigo);
        cc.transferir(100.00 , poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
