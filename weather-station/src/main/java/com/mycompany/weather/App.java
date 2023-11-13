package com.mycompany.weather;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay d1 = new CurrentConditionsDisplay(wd);
        ForecastDisplay          d2 = new ForecastDisplay(wd);
        StatisticsDisplay        d3 = new StatisticsDisplay(wd);
        HeatIndexDisplay         d4 = new HeatIndexDisplay(wd);

        //wd.registerObserver(new CurrentConditionsDisplay());
        //wd.registerObserver(new ForecastDisplay());
        //wd.registerObserver(new StatisticsDisplay());

        while(true) {
          wd.measurementsChanged();

          try {
            TimeUnit.SECONDS.sleep(1);
          }
          catch (InterruptedException ex) {
            ex.printStackTrace();
          }

        }

    }
}
