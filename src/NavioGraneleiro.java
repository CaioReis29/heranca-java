public class NavioGraneleiro extends Navio {

    private int quantidadeEscotilhas;

    public NavioGraneleiro(String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeEscotilhas) {
        super(nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }

    public int getQuantidadeEscotilhas() {
        return quantidadeEscotilhas;
    }

    public void setQuantidadeEscotilhas(int quantidadeEscotilhas) {
        this.quantidadeEscotilhas = quantidadeEscotilhas;
    }
    @Override
    public String toString() {
        return "\nIdentificador........: " + this.getId() +
                "\nNome................: " + this.getNome() +
                "\nCapacidade de carga.: " + this.getCapacidadeCarga() +
                "\nQuant. de escotilhas:" + this.getQuantidadeEscotilhas();
    }
}
