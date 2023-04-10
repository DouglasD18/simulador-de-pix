package com.trybe.simuladordepix;

public class ErroValorNaoPositivo extends ErroDePix {

  private static final long serialVersionUID = 1L;

  public ErroValorNaoPositivo() {
    super(Mensagens.VALOR_NAO_POSITIVO);
  }

}
