public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static  int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) throws ExcecaoDeNegocios {
        if (saldo < valor){
            throw new ExcecaoDeNegocios("Conta não possui saldo");
        }
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) throws ExcecaoDeNegocios {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    protected void imprimirInfosComuns() {
        System.out.println("Banco " + Banco.banco.nome());
        System.out.println("Titular: " + cliente.nome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero: " + numero);
        System.out.printf("Saldo: %.2f\n" , saldo);
    }

}

