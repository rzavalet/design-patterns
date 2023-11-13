package com.mycompany.weather;

import java.text.MessageFormat;

/*
 * StatisticsDisplay.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */
public class StatisticsDisplay implements Observer
{
	public StatisticsDisplay(Subject s) {
    s.registerObserver(this);
	}

  public void update(float temp, float humidity, float pressure) {
    System.out.println(MessageFormat.format("Statistics Display: {0}, {1}, {2}", temp, humidity, pressure));
  }
}

