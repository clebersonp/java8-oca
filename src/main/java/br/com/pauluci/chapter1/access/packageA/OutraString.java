package br.com.pauluci.chapter1.access.packageA;

import java.lang.String;

// não compila, pois a classe String é final e não pode ser extendida e não pode ter seus metodos sobrescritos por outro programador
public class OutraString extends String {}