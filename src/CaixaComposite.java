import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaixaComposite implements Objeto{
    private String id;
    private String remetente;
    private List<Objeto> objetos = new ArrayList<Objeto>();

    public CaixaComposite(String id, String remetente) {
        this.id = id;
        this.remetente = remetente;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CaixaComposite(String id) {
        this.id = id;
    }
    public CaixaComposite(){}



    
    @Override
    public void add(Objeto ...objetos){
        this.objetos.addAll(Arrays.asList(objetos));
    }
    public void add(Objeto objeto, int quantidade){
        for(int i=0;i<quantidade;i++){
            this.objetos.add(objeto);
        }
    }
    @Override
    public void remove(Objeto objeto){
        this.objetos.remove(objeto);
    }
    @Override
    public double getCusto() {
        double somaCusto = 0;
        for(Objeto objeto : objetos){
            somaCusto += objeto.getCusto();
        }
        return somaCusto;
    }

    @Override
    public double getPreco() {
        double somaPreco = 0;
        for(Objeto objeto : objetos){
            somaPreco += objeto.getPreco();
        }
        return somaPreco;
    }

    @Override
    public void imprimir(){
        System.out.print("Caixa de id: "+id+"; Custo total: "+getCusto()+"; Preço total: "+getPreco()+"; Remetente: "+getRemetente());
        System.out.println();
        for(Objeto objeto : objetos){
            System.out.print("    ");
            objeto.imprimir();
        }
    }

    @Override
    public Objeto getComposite() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getComposite'");
    } 
}
