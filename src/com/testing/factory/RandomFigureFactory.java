package com.testing.factory;

import com.testing.Figure;

import java.util.Random;

public class RandomFigureFactory implements FigureFactory {
    FigureFactory[] factories;
    Random r = new Random();

    public RandomFigureFactory(FigureFactory[] factories) {
        this.factories = factories;
    }

    @Override
    public Figure create() {
        return factories[r.nextInt(factories.length)].create();
    }
}
