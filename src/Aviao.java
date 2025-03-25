public class Aviao extends Veiculo {
    private String prefixo;
    private String dataRevisao;

    public Aviao() {}

    public Aviao(double capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public void imprimir() {
        System.out.println("Avião Prefixo: " + prefixo + ", Data Revisão: " + dataRevisao + ", Capacidade do Tanque: " + getCapacidadeTanque() + ", Número de Passageiros: " + getNumeroPassageiros() + ", Preço: " + getPreco());
    }

    public void reajustarPreco(double percentual) {
        setPreco(getPreco() * (1 + percentual / 100));
    }
}