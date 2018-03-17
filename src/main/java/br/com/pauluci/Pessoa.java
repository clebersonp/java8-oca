/*
 * Comentários
 */
package br.com.pauluci;

import java.time.LocalDate; // instrução import para utilizar a classe LocaDate

/**
 * Javadoc
 * @author cleberson
 *
 */
public class Pessoa {

  // variáveis de instância - estado do objeto
  private String documento; // número do documento
  private String nome; // nome da pessoa
  private LocalDate nascimento; // data do nascimento
  
  // contrutor
  public Pessoa(String documento, String nome, LocalDate nascimento) {
    this.documento = documento;
    this.nome = nome;
    this.nascimento = nascimento;
  }
  // métodos getters e setters - comportamento do objeto
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }
  
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getNascimento() {
    return nascimento;
  }
  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
  }
}

// comentário depois da declaração da classe