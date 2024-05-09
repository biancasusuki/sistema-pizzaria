package TrabalhoPOO;

public class Pizza {
    private String pedacos;
    private double sabor;
    private double massa;
    private double bebida;
    private double preco;

    public Pizza(){}

    public String getPedacos() {
        return pedacos;
    }

    public void setPedacos(String tamanho) {
        this.pedacos = tamanho;
    }

    public double getSabor() {
        return sabor;
    }
    
    public double getMassa() {
        return massa;
    }

    public double getBebida() {
        return bebida;
    }

    public void setSabor(int sab) {
        // Sabor
        switch(sab){
            case 0:  sabor = 49; break;
            case 1:  sabor = 47; break;
            case 2:  sabor = 49; break;
            case 3:  sabor = 49; break;
            case 4:  sabor = 45; break;
            case 5:  sabor = 51; break;
            case 6:  sabor = 39; break;
            case 7:  sabor = 68; break;
            case 8:  sabor = 53; break;
            case 9:  sabor = 45; break;
            case 10: sabor = 53; break;
            case 11: sabor = 51; break;
            case 12: sabor = 49; break;
            case 13: sabor = 45; break;
            case 14: sabor = 39; break;
            case 15: sabor = 47; break;
            case 16: sabor = 54; break;
            case 17: sabor = 58; break;
            case 18: sabor = 53; break;
            case 19: sabor = 55; break;
            case 20: sabor = 51; break;
            case 21: sabor = 55; break;
            case 22: sabor = 49; break;
        }
    }
    
    public void setMassa(double mas) {
        //Massa
        if(mas==1){
            massa = 2.50;
        } else{
            massa = 0;
        }
    }
    
    public void setBebida(int beb) {
        // Bebida

        switch(beb){
            case 1: bebida = 5.50; break;
            case 2: bebida = 7.50; break;
            case 3: bebida = 9.50; break;
            case 4: bebida = 5.60; break;
        }
    }
    
    public void setPreco() {
        preco = getMassa()+getSabor()+getBebida();
    }
}
