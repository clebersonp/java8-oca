package br.com.pauluci.chapter1.declaration;

public class IdentificadoresLegais {
	
	public static void main(String[] args) {
		
		// identificadores são nomes que damos para as variaveis, metodos, classes em java.
		
		// Não tem limite para um identificador, desde que siga as seguintes regras:
		// Identificadores legais ao iniciar o nome: _ $ a-z A-Z
		// Identificadores legais apos iniciar o nome: _ $ a-z A-Z 0-9

		int _quantidade_$1 = 10;
		String $___nome$___e__Sobrenome = "Cleberson Pauluci";
		int $_valor_$_em_Porcentagem$$$$$__________$__$_$_$_$000000001___$ = 10000;

		System.out.println(String.format("Quantidade: %d", _quantidade_$1));
		System.out.println(String.format("Nome completo: %s", $___nome$___e__Sobrenome));
		System.out.println(String.format("Valor: %d", $_valor_$_em_Porcentagem$$$$$__________$__$_$_$_$000000001___$));
	}

}
