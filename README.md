# Preparação OCA Java SE 8 
Anotações e exemplos práticos para certificação.

## Estrutura de classe
1.  Declaração de package - se houver;
2.  Imports - se houver;
3.	Declaração da classe;
    1.	Variáveis;
    2.	Construtores;
    3.	Métodos;
    4. Classes encadeadas;
    5.	Interfaces encadeadas;
4.	Enum;
5.  Comentários. Podem ser adicionados em qualquer lugar, pois o compilador os ignora;

<details>
    <summary>Ex.:</summary>
    <p>Exemplo de estrutura de classe em Java</p>
        
        /*
        * Comentários
        */
        package br.com.pauluci; // deve ser a primeira instrução do arquivo .java, quando existir package;

        import java.time.LocalDate; // instrução import para utilizar a classe LocaDate. Deve sempre preceder a declaração da classe, quando existir imports

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
</details>

----

## Declaração da classe
1.  Modificadores de acesso;
2.  Modificadores sem acesso;
3.  Nome da Classe;
4.  Nome da classe base, se a classe extender de outra classe;
5.  Todas as implementações de Interfaces, se a classe implementar alguma interface;
6.  Corpo da Classe (campos da classe, construtores, métodos), que são inseridos dentro do par de chaves, **{ }**

<details>
    <summary>Ex.:</summary>
    <p>Exemplo declaração de classe</p>
    
    public final class Corredor extends Pessoa implements Atleta { }
    
public                  | final                  | class         | Corredor       | extends       | Pessoa              | implements    | Atleta            | { } 
----------------------- | ---------------------- | ------------- | -------------- | ------------- | ------------------- | ------------- | ----------------- | ----------------
Modificador de acesso   | Modificador sem acesso | Palavra chave | Nome da Classe | Palavra chave | Nome base da Classe | Palavra chave | Nome da interface | Par de chaves
Opcional                | Opcional               | Obrigatório   | Obrigatório    | Opcional      | Opcional            | Opcional      | Opcional          | Obrigatório
    
</details>

----
