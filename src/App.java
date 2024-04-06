public class App {
    public static void main(String[] args) throws Exception {
        
        EstanteComposite estante1 = new EstanteComposite("e1");
        CaixaComposite c1 = new CaixaComposite("c1", "P&G");
        Objeto geladeira1 = new Geladeira("Electrolux",700,2000);
        Objeto geladeira2 = new Geladeira("Consul",1300,3000);
        Objeto p1 = new ProtetorSolar("Head and shoulder", 60, 15, 40);
        Objeto p2 = new ProtetorSolar("Pantene", 80, 25, 70);



        estante1.add(geladeira1);
        estante1.add(geladeira2);
        c1.add(p1);
        c1.add(p2);
        estante1.add(c1);
        
        estante1.imprimir();
    }
}
