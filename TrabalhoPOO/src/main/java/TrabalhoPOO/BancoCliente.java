package TrabalhoPOO;

public class BancoCliente implements TAD_Pilha {

    private int topo;	//Topo da Pilha
    private int MAX;	//Tamanho da Pilha
    private String memo[];	//Elementos da Pilha (objeto genérico)

    //Método construtor que inicializa a Pilha no estado vazia
    public BancoCliente() {
        topo = -1;
        MAX = 30;
        memo = new String[MAX];
    }

    //Método construtor que inicializa a Pilha com tamanho máximo desejado
    public BancoCliente(int qtde) {
        topo = -1;
        MAX = qtde;
        memo = new String[MAX];
    }

    //Método que verifica se a Pilha está Vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    //Método que verifica se a Pilha está cheia
    public boolean isFull() {
        return (topo == MAX - 1);
    }

    //Método para inserir um valor na Pilha
    public String push(String x) {
        if (!isFull()) {
            memo[++topo] = x;
            return x;
        } else {
            return null;
        }
    }

    //Método para retornar o conteúdo da Pilha
    public String toString() {
        if (!isEmpty()) {
            String msg = "";
            for (int i = 0; i <= topo; i++) {
                msg += " " + memo[i].toString();
                if(i!=topo)msg += "\n";
            }
            return ("P: [ \n" + msg + " \n]");
        } else {
            return "P: [ ]";
        }
    }

    //Método para retornar o topo da Pilha e remove-lo
    public String pop() {
        if (!isEmpty()) {
            return memo[topo--];
        } else {
            return null;
        }
    }

    //Método que retorna o topo da pilha sem removê-lo
    public String top() {
        if (!isEmpty()) {
            return memo[topo];
        } else {
            return null;
        }
    }

    public String[] getMemo() {
        return memo;
    }
    
    public int busca(String buscado) {
        for(int i= 0; i< memo.length; i++){
            if(memo[i] == null){
                return -1;
            }
            if(memo[i].equals(buscado)) return i;
        }
        return -1;
    }

    
}
