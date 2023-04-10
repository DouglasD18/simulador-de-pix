package com.trybe.simuladordepix;

public abstract class ErroDePix extends Exception {

  private static final long serialVersionUID = 1L;

  public ErroDePix(String mensagem) {
    super(mensagem);
  }
}
