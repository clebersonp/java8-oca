package br.com.pauluci.chapter1.declaration;

public class IdentificadoresIlegais {
	
	public static void main(String[] args) {
		
		// identificadores são nomes que damos para as variaveis, metodos, classes em java.
		
		// Identificadores ilegais ao iniciar o nome: todos diferentes de _ $ a-z A-z
		// Identificadores legais apos iniciar o nome: todos diferente de _ $ a-z A-Z 0-9

		int 1_quantidade_$1 = 10;
		String #$___nome$___e__Sobrenome = "Cleberson Pauluci";
		int $_valor_$_em_Porcentagem$$$$$__________$__$_$_$_$000000001___$! = 10000;

		System.out.println(String.format("Quantidade: %d", 1_quantidade_$1));
		System.out.println(String.format("Nome completo: %s", #$___nome$___e__Sobrenome));
		System.out.println(String.format("Valor: %d", $_valor_$_em_Porcentagem$$$$$__________$__$_$_$_$000000001___$!));
	}

}
