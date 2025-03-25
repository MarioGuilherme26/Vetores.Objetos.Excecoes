public class Main {
    public static void main(String[] args) {
        // Instanciando e utilizando objetos da classe Aviao
        Aviao aviao = new Aviao(5000.0, 150, 100000.0, "PT-XYZ", "01/01/2025");
        aviao.imprimir();
        aviao.reajustarPreco(10.0);
        System.out.println("Preço reajustado do Avião: " + aviao.getPreco());

        // Instanciando e utilizando objetos da classe Navio
        Navio navio = new Navio(20000.0, 500, 500000.0, "Titanic II", 50, "10/10/2020");
        navio.imprimir();
        System.out.println("Passageiros por tripulante no Navio: " + navio.passageirosPorTripulantes());
    }
}