//Interface componente
public interface Objeto {
    public double getCusto();
    public double getPreco();
    public void imprimir();
    public void add(Objeto ...objetos);
    public void remove(Objeto objeto);
    public Objeto getComposite();
}
