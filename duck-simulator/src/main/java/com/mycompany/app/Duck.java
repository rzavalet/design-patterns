package com.mycompany.app;
/*
 * Duck.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Duck
{

  private FlyBehavior flyBehavior;
  private QuackingBehavior quackingBehavior;

	public Duck() {
		
	}

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackingBehavior(QuackingBehavior quackingBehavior) {
    this.quackingBehavior = quackingBehavior;
  }

  public void quack() {
    this.quackingBehavior.quack();
  }

  public void swim() {
    System.out.println("Swim!");
  }

  public void display() {
    System.out.println("I am a generic duck!");
  }

  public void fly() {
    this.flyBehavior.fly();
  }


}

