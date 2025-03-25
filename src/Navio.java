public class Navio extends Veiculo {
    private String nome;
    private int numeroTripulantes;
    private String dataLancamento;

    public Navio() {}

    public Navio(double capacidadeTanque, int numeroPassageiros, double preco, String nome, int numeroTripulantes, String dataLancamento) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.numeroTripulantes = numeroTripulantes;
        this.dataLancamento = dataLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public void imprimir() {
        System.out.println("Navio Nome: " + nome + ", Data Lançamento: " + dataLancamento + ", Capacidade do Tanque: " + getCapacidadeTanque() + ", Número de Passageiros: " + getNumeroPassageiros() + ", Número de Tripulantes: " + numeroTripulantes + ", Preço: " + getPreco());
    }

    public double passageirosPorTripulantes() {
        return (double) getNumeroPassageiros() / numeroTripulantes;
    }
}