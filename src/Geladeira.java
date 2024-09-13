public class Geladeira implements Objeto{
    private String modelo;
    private double custo;
    private double preco;

    
    public Geladeira(String modelo, double custo, double preco) {
        this.modelo = modelo;
        this.custo = custo;
        this.preco = preco;
    }
    public void setModelo(String modelo) {
            this.modelo = modelo;
    }
    public String getModelo() {
        return modelo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    @Override
    public double getCusto() {
        return custo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    @Override
    public double getPreco() {
        return preco;
    }


    @Override
    public void imprimir() {
        System.out.print("Geladeira "+modelo+"; Custo:R$ "+custo+"; Preço:R$ "+preco);
        System.out.println();
    }
    @Override
    public void add(Objeto... objetos) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public void remove(Objeto objeto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
    @Override
    public Objeto getComposite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getComposite'");
    }
  
}
