public class ArCondicionado implements Objeto{
    private String modelo;
    private int btu;
    private double custo;
    private double preco;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getBtu() {
        return btu;
    }
    public void setBtu(int btu) {
        this.btu = btu;
    }
    @Override
    public double getCusto() {
        return custo;
    }
    public void setCusto(double custo) {
        this.custo = custo;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }
    
    
}
