package com.mycompany.app;

/*
 * Quack.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Quack implements QuackingBehavior
{
  public Quack()
  {
  }

  public void quack() {
    System.out.println( "Quack!" );
  }

}

