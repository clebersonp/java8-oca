package br.com.pauluci.chapter1.access.packageB;

// não é visivel pois a classe Beverage está com o modificador de acesso default, ou seja, visivel somente dentro do packageA. Não compila
import br.com.pauluci.chapter1.access.packageA.Beverage;

// modificador de acesso default, somente visivel no packageB
class Tea extends Beverage {}