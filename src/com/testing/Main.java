package com.testing;

import com.testing.factory.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RandomFigureFactory factory = new RandomFigureFactory(new FigureFactory[]{
                new SquareFactory(),
                new CircleFactory(),
                new TriangleFactory(),
                new TrapezoidFactory()
        });

        // generate random list of figures
        List<Figure> randomFigures = new ArrayList<>();
        int randomCountOfFugure = (int)(1 + Math.random() * 19);
        for(int i = 0; i < randomCountOfFugure; i++) {
            Figure figure = factory.create();
            randomFigures.add(figure);
        }

        //print
        System.out.println("--- Count of all figures: " + randomFigures.size() + " ---");
        int counter = 0;
        for (Figure f : randomFigures) {
            counter++;
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println(counter + ". " + f.toString());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

    }
}
