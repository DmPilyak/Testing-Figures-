package com.testing.factory;

import com.testing.Circle;
import com.testing.Figure;

public class CircleFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new Circle((int)(1 + Math.random()*15), FigureColors.randomColor());
    }
}
