public class NavioContainer extends Navio {

    private int quantidadeGuindastes;
    private int quantidadeCamaras;

    public NavioContainer(String nome, int quantidadePoroes, double capacidadeCarga, int quantidadeGuindastes, int quantidadeCamaras) {
        super(nome, quantidadePoroes, capacidadeCarga);
        this.quantidadeGuindastes = quantidadeGuindastes;
        this.quantidadeCamaras = quantidadeCamaras;
    }

    public int getQuantidadeGuindastes() {
        return quantidadeGuindastes;
    }

    public void setQuantidadeGuindastes(int quantidadeGuindastes) {
        this.quantidadeGuindastes = quantidadeGuindastes;
    }

    public int getquantidadeCamaras() {
        return quantidadeCamaras;
    }

    public void setquantidadeCamaras(int quantidadeCamaras) {
        this.quantidadeCamaras = quantidadeCamaras;
    }
    @Override
    public String toString() {
        return "\nIdentificador.....:" + getId() +
                "\nNome.............:" + getNome() +
                "\nQuat. de porões..:" + getQuantidadePoroes() +
                "\nCapacidade carga.:" + getCapacidadeCarga() +
                "\nQuant. câmaras...:" + getquantidadeCamaras() +
                "\nQuant. guindastes:" + getQuantidadeGuindastes();
    }
}
