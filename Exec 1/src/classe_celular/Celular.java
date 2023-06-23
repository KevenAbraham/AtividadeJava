package classe_celular;

public class Celular {

	public static void main(String[] args) {
		AtributosCelular celular1 = new AtributosCelular("Apple", "Iphone 14 PRO MAX", "Amarelo", 128, true);
		celular1.status();
		System.out.println("");
		AtributosTelefoneCelular celular2 = new AtributosCelular("Motorola", "Moto G2 ", "Preto", 2, false);
		celular2.status();

	}

}
