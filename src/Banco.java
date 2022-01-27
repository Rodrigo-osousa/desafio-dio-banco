import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contas=" + contas +
                '}';
    }
}
