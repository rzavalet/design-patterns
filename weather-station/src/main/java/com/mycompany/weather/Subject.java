package com.mycompany.weather;

/*
 * Monitor.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public interface Subject
{

  public void registerObserver(Observer d);
  public void removeObserver(Observer d);
  public void notifyObservers(float temp, float humidity, float pressure);
}

