package com.mycompany.app;

/*
 * FlyNoWay.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class FlyNoWay implements FlyBehavior
{
	public FlyNoWay() {
		
	}

  public void fly()
  {
    System.out.println("I DONT fly!");
  }

}

