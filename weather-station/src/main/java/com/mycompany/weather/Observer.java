package com.mycompany.weather;
/*
 * Display.java
 * Copyright (C) 2023 rzavalet <rzavalet@noemail.com>
 *
 * Distributed under terms of the MIT license.
 */

public interface Observer
{
  public void update(float temp, float humidity, float pressure);
}

