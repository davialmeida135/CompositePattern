public class ProtetorSolar implements Objeto{
    private String marca;
    private int fps;
    private double custo;
    private double preco;
    

    public ProtetorSolar(String marca, int fps, double custo, double preco) {
        this.marca = marca;
        this.fps = fps;
        this.custo = custo;
        this.preco = preco;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFps() {
        return fps;
    }
    public void setFps(int fps) {
        this.fps = fps;
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
        System.out.print("Protetor solar "+marca+"; Custo:R$ "+custo+"; Preço:R$ "+preco);
        System.out.println();
    }
    
}
