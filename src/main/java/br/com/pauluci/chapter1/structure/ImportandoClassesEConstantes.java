package br.com.pauluci.chapter1.structure;

// Importando todas as classes do pacote java.util com wildcard *;
import java.util.*;

// importando todas os membros constantes(final e static) da classe Integer;
// static import ordem não é valida
import static java.lang.Integer.*;

// cuidado com os membros staticos ambiguos com outras classes
import static java.lang.Long.*;

import static java.lang.System.out;

// import static incorreto, erro de compilação
// static import java.util.Arrays.asList;

// não dá erro de compilação, porém não irá procurar dentro dos subpackages, somente dentro do package java;
import java.*;

public class ImportandoClassesEConstantes {
	
	public static void main(String[] args) {
		
		// para evitar erro de constantes ambiguos precisamos usar a classes tbm, caso contrário teremos erro de compilação;
		out.println("Valor máximo para Integer: " + Integer.MAX_VALUE);
		out.println("Valor máximo para Long: " + Long.MAX_VALUE);
		out.println("Valores: " + Arrays.asList("1", "2"));
	}
	
}