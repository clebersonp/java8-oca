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
