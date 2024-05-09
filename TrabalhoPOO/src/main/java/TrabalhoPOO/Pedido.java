package TrabalhoPOO;
public class Pedido extends Cliente{
    private double preco;
    
    public Pedido(){}

    public double getPreco() {
        return preco;
    }

    public void calculaPrecos(double m, double b, double s) {
        this.preco = m+b+s;
    }
    
    public void setPreco(double p) {
        this.preco = p;
    }
    
    public Object[] obterDados(String nome){
        return new Object[] {nome, getPizzas(), getCep(), getPreco()};
    }
}

