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

## Definição de classe
Classe é o design usado para especificar _atributos_ e _comportamentos_ de um objeto.<br/>
__Atributos__: são implementados usando variáveis;<br/>
__Comportamentos__: são implementados usando métodos;

<details>
    <summary>Ex.:</summary>
    <p>Exemplo definição de atributos e métodos de uma classe</p>
        
        package br.com.pauluci;

        public class Celular {

          private String IMEI;
          private String modelo;
          private String fabricante;
          private String peso;
            
          public Celular(String IMEI) {
            this.IMEI = IMEI;
          }
          
          public String getIMEI() {
            return IMEI;
          }
          public void setIMEI(String iMEI) {
            IMEI = iMEI;
          }

          public String getModelo() {
            return modelo;
          }
          public void setModelo(String modelo) {
            this.modelo = modelo;
          }

          public String getFabricante() {
            return fabricante;
          }
          public void setFabricante(String fabricante) {
            this.fabricante = fabricante;
          }

          public String getPeso() {
            return peso;
          }
          public void setPeso(String peso) {
            this.peso = peso;
          }
          
          public void fazerChamada() {
            // codigo...
          }
        }
</details>

#### Variáveis
* As variáveis que foram usadas no exemplo anterior são utilizadas para armazenar o estado do objeto(_instância_) Celular. E as variáveis são chamadas de _variáveis de instância_ ou _atributos de instância_ e seu valor pertence somente ao objeto;
* Variáveis declaradas com o _modificador sem acesso_ __static__ na classe são chamadas de _variáveis de classe_ e seu valor é compartilhado para todos os objetos da aplicação;

#### Métodos
* Os métodos criados no exemplo anterior são utilizadas para manipular o estado do objeto(instância) Celular. São chamados de ___métodos de instância___;
* Os ___métodos de classe___ ou ___métodos statics___ podem ser utilizados para manipular ___variáveis statics___ ou invocar outros ___métodos statics___;

#### Construtores
* Na classe _Celular_ do exemplo anterior define um simples contrutor que recebe o _IMEI_ como parâmetro. Um construtor é utilizado para criar e inicializar os objetos de uma classe. A classe pode definir multiplos construtores que aceitam diferentes configurações de parâmetros;

----

## Definição de interface
#### Interface especifica os contratos que a classe deve implementar.<br/>
Ex.:<br/>
Não importa qual a marca da sua TV, toda TV provê de funcionalidades comuns, como por exemplo, trocar de canal, alterar o volume. Podemos comparar o controle da TV com uma interface e a TV com uma classe que implementa a interface controle.<br/>
* Por padrão, métodos de interface são implicitamente abstratos, ou seja, sem código no corpo do método;
* Interfaces podem conter constantes;
* Com Java 8, interfaces podem também definir métodos _estáticos_(___static___);
* A partir do Java 8, interfaces podem possuir métodos com definição(implementação) no corpo e são chamados de ___métodos default___.

<details>
    <summary>Ex.:</summary>
    <p>Exemplo definição de interface</p>
        
        package br.com.pauluci;

        public interface Controle {

          public static final String COMUNICACAO = "IR"; // constante

          // métodos abstratos por defaul
          void mudarCanal(int numeroCanal);
          void aumentarVolume();
          void diminuirVolume();

          // Novidade no Java 8. Métodos com implementação
          default void aumentarVolumeNoIntervalo(int intervalo) {
            for (; intervalo > 0; intervalo-- ) {
              this.aumentarVolume();
            }
          }

          // Método estático só pode acessar membros estáticos
          static String recuperarTipoComunicacao() {
            return Controle.COMUNICACAO;
          }
        }
</details>

----

## Definição de única ou múltiplas classes em um único arquivo fonte java.
Pode ser definido uma classe ou interface em um único código java ou múltiplas entidades.
* Em um arquivo fonte java só pode existir uma classe ou interface ____public__ e seu nome deve combinar com o nome do aquivo ___.java___;
* Pode conter múltiplas classes e/ou interfaces dentro de um mesmo arquivo ___.java___. Porém, somente a classe de mesmo nome do arquivo deve ser declarada como ___public___;
* A ordem em que as múltiplas entidades são definidas dentro de um mesmo arquivo não importa;
* Quando usadas as instruções ___package___ ou ___import___, ambas instruções são aplicadas para todas as classes ou interfaces definidas no mesmo arquivo fonte;
* Quando compilado, será gerado um ___bytecode___(.class) para cada entidade separadamente;
* As entidades que foram definidas dentro do mesmo arquivo java não podem ser definidas em ___packages___ diferentes uma das outras;

<details>
    <summary>Ex.:</summary>
    <p>Exemplo de definição de múltiplas entidades em um único arquivo fonte Celular.java</p>
        
        package br.com.pauluci;

        public class Celular {
          // codigo da classe Celular
        }

        interface Ligavel {
          // codigo da interface
        }

        class Mobilidade {
          // código da classe Mobilidade
        }

        interface Portatil {
          // código da interface Portatil
        }
        
</details>

----

## Classes Java executáveis e não executáveis
* Para ser considerada uma classe java executável é necessário ter um método especial ou _entry point_ chamado de método ___main___;
* Uma aplicação pode conter milhares de classes, interfaces, enums, mas para a aplicação ser executada pela __JVM__(Java Virtual Machine) é necessário ter uma classe executável. Será essa classe que dara inicio à execução da aplicação;
* Uma aplicação pode conter várias classes executáveis. Porém só uma e somente uma classe executável deve ser informada como ___entry point___ à __JVM__ para dar início à execução.

Ex.:<br/>
![picture alt](https://github.com/clebersonp/java8-oca/blob/master/src/main/resouces/img/aplicacao_executavel_java.jpg "Aplicação executável")
