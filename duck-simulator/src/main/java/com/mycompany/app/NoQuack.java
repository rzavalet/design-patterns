package com.mycompany.app;
/*
 * NoQuack.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class NoQuack implements QuackingBehavior
{
  public NoQuack()
  {
  }

  public void quack() {
    System.out.println( "NO QUACK!" );
  }
}

