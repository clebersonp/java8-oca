// comentario pode ser colocado em qual lugar do arquivo java

// se houver instrução de import, ele deverá estar entre o package e a declaração da classe.
// Se não houver instrução de package, a instrução de import deverá ser a primeira
import java.util.Arrays;
import java.util.List;

// se houver instrução de package, ele deverá ser a primeira instrução do arquivo
package br.com.pauluci.chapter1.structure;

// Se não houver declaração de package e import, a declaração da classe deverá ser a primeira do arquivo.
// Se houver declaração de package e não tiver declaração de imports, a declaração da classe deverá ser a segunda, logo apos a declaração do package
// Se houver declaração de import e não tiver declaração de package, a declaração da classe deverá se a segunda. logo apos a declaração dos imports
// O arquivo java deve ter o mesmo nome da classe.
// Só é permitido uma unica class public por arquivo java
// Podem conter outras classes dentro do mesmo arquivo java, porem não pode ter o mesmo nome do arquivo e não podem ser publics
public class DeclaracaoArquivoFonteInvalido {
	
	public static void main(String[] args) {
		String a = "Valor de A";
		String b = "Valor de B";
		
		List<String> valores = Arrays.asList(a, b);
		
		System.out.println(valores);
	}
	
}