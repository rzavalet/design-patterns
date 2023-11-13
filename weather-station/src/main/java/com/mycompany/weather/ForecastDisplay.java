package com.mycompany.weather;

import java.text.MessageFormat;
/*
 * ForecastDisplay.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class ForecastDisplay implements Observer
{
	public ForecastDisplay(Subject s) {
	  s.registerObserver(this);	
	}

  public void update(float temp, float humidity, float pressure) {
    System.out.println(MessageFormat.format("Forecast Display: {0}, {1}, {2}", temp, humidity, pressure));
  }

}

