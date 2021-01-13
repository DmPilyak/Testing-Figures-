package com.testing.factory;

import com.testing.Figure;
import com.testing.Triangle;

public class TriangleFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new Triangle((int)(1 + Math.random()*15), FigureColors.randomColor());
    }
}
