package com.mycompany.weather;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/*
 * WeatherData.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public class WeatherData implements Subject
{
  List<Observer> list;
  private Random r = new Random();

	public WeatherData() {
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

  private float getTemperature() {
    return r.nextFloat();
  }

  private float getHumidity() {
    return r.nextFloat();
  }

  private float getPressure() {
    return r.nextFloat();
  }

  public void measurementsChanged() {
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    System.out.println("\n=============== Displaying ===========");
    notifyObservers(temp, humidity, pressure);
  }

}

