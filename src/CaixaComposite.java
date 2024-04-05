import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaixaComposite implements Objeto{
        private String id;
        private String remetente;

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



    private List<Objeto> objetos = new ArrayList<Objeto>();

    public void add(Objeto ...objetos){
        this.objetos.addAll(Arrays.asList(objetos));
    }

    public void add(Objeto objeto, int quantidade){
        for(int i=0;i<quantidade;i++){
            this.objetos.add(objeto);
        }
    }

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
        System.out.print("Prateleira de id: "+id+"\n");
        for(Objeto objeto : objetos){
            System.out.print("  ");
            objeto.imprimir();
        }
    } 
}
