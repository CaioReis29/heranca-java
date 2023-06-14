public abstract class Navio {
	
    private static int contadorId = 0;

    private int id;
    private String nome;
    private int quantidadePoroes; 
    private double capacidadeCarga;
    private String disponibilidade;

    public Navio(String nome, int quantidadePoroes, double capacidadeCarga) {
        super();
        contadorId++;
        this.id = contadorId;
        this.nome = nome;
        this.quantidadePoroes = quantidadePoroes;
        this.capacidadeCarga = capacidadeCarga;
        this.disponibilidade = "";
    }
    public void iniciarCarregamento() {
        this.disponibilidade = "Carregando";
    }
    public void bloquearCarregamento() {
        this.disponibilidade = "Lotado";
    }
    public int  getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadePoroes() {
        return quantidadePoroes;
    }
    public void setQuantidadePoroes(int quantidadePoroes) {
        this.quantidadePoroes = quantidadePoroes;
    }
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public String getDisponibilidade() {
        return disponibilidade;
    }
}