package classe_celular;

public class AtributosCelular {
	private String marca;
    private String modelo;
    private String cor;
    private int armazenamento;
    private boolean ligado;

    // Construtor
    public AtributosCelular(String marca, String modelo, String cor, int armazenamento, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.armazenamento = armazenamento;
        this.ligado = ligado;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void status() {
    	System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Armazenamento: " + getArmazenamento() + "GB");
        System.out.println("Está ligado? " + (isLigado() ? "Sim" : "Não\n"));
    }

}
