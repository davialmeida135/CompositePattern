public class App {
    public static void main(String[] args) throws Exception {
        
        EstanteComposite estante1 = new EstanteComposite("e1");
        Objeto geladeira1 = new Geladeira("Electrolux",700,2000);
        Objeto geladeira2 = new Geladeira("Consul",1300,3000);

        estante1.add(geladeira1);
        estante1.add(geladeira2);
        estante1.imprimir();
    }
}
