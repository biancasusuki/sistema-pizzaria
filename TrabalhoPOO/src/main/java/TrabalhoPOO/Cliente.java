package TrabalhoPOO;
public class Cliente extends Endereco{
    private String nome;
    private int qtd;
    private BancoCliente pizzas;
    private int telefone;
    
    public Cliente(){}

    public BancoCliente getPizzas() {
        return pizzas;
    }
    
    public int getQtd() {
        return qtd;
    }

    public void setQtdPizzas(int qtd) {
        this.qtd = qtd;
        pizzas = new BancoCliente(qtd);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}
