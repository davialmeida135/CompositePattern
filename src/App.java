public class App {
    public static void main(String[] args) throws Exception {
        
        EstanteComposite estante1 = new EstanteComposite("e1");
        CaixaComposite caixa1 = new CaixaComposite("c1", "P&G");
        Objeto geladeira1 = new Geladeira("Electrolux",700,2000);
        Objeto geladeira2 = new Geladeira("Consul",1300,3000);
        Objeto protetor1 = new ProtetorSolar("Head and shoulder", 60, 15, 40);
        Objeto protetor2 = new ProtetorSolar("Pantene", 80, 25, 70);



        estante1.add(geladeira1);
        estante1.add(geladeira2);
        caixa1.add(protetor1);
        caixa1.add(protetor2);
        estante1.add(caixa1);
        
        estante1.imprimir();
    }
}
