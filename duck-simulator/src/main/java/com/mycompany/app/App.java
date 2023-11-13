package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        Duck duck1 = new Duck();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackingBehavior(new Quack());

        Duck duck2 = new MallardDuck();
        duck2.setFlyBehavior(new FlyWithWings());
        duck2.setQuackingBehavior(new Quack());

        Duck duck3 = new RedheadDuck();
        duck3.setFlyBehavior(new FlyWithWings());
        duck3.setQuackingBehavior(new Quack());

        Duck duck4 = new RubberDuck();
        duck4.setFlyBehavior(new FlyNoWay());
        duck4.setQuackingBehavior(new NoQuack());

        List<Duck> mylist = new ArrayList<Duck>(Arrays.asList(duck1, duck2, duck3, duck4));

        for (Duck d : mylist) {
          d.display();
          d.fly();
          d.quack();
        }
    }
}
