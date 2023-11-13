package com.mycompany.weather;

import java.util.List;
import java.util.ArrayList;

/*
 * Monitor.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class Monitor implements Subject
{
  List<Observer> list;

	public Monitor() {
	  list = new ArrayList<Observer>();	
	}

  public void registerObserver(Observer d) {
    list.add(d);
  }

  public void removeObserver(Observer d) {
    list.remove(d);
  }

  public void notifyObservers(float temp, float humidity, float pressure) {
    for (Observer d : list) {
      d.update(temp, humidity, pressure);
    }
  }
}

