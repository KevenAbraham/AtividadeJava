package classe_aniversario;

public class AtributosAniversario {
	 	private String nomeAniversariante;
	    private int idadeAniversariante;
	    private String local;
	    private String data;
	    private int numeroConvidados;
	    
	    public AtributosAniversario(String nomeAniversariante, int idadeAniversariante, String local, String data , int numeroConvidados) {
	        this.nomeAniversariante = nomeAniversariante;
	        this.idadeAniversariante = idadeAniversariante;
	        this.local = local;
	        this.data = data;
	        this.numeroConvidados = numeroConvidados;
	    }

	    public String getNomeAniversariante() {
	        return nomeAniversariante;
	    }

	    public void setNomeAniversariante(String nomeAniversariante) {
	        this.nomeAniversariante = nomeAniversariante;
	    }

	    public int getIdadeAniversariante() {
	        return idadeAniversariante;
	    }

	    public void setIdadeAniversariante(int idadeAniversariante) {
	        this.idadeAniversariante = idadeAniversariante;
	    }

	    public String getLocal() {
	        return local;
	    }

	    public void setLocal(String local) {
	        this.local = local;
	    }

	    public String getData() {
	        return data;
	    }

	    public void setData(String data) {
	        this.data = data;
	    }

	    public int getNumeroConvidados() {
	        return numeroConvidados;
	    }

	    public void setNumeroConvidados(int numeroConvidados) {
	        this.numeroConvidados = numeroConvidados;
	    }
	    
	    public void status() {
	    	System.out.println("Nome do Aniversariante: " + getNomeAniversariante());
	        System.out.println("Idade: " + getIdadeAniversariante());
	        System.out.println("Local da Festa: " + getLocal());
	        System.out.println("Data da Festa: " + getData());
	        System.out.println("Convidados: " + getNumeroConvidados());
	    }

}
