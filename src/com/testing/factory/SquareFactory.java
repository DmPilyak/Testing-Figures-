package com.testing.factory;

import com.testing.Figure;
import com.testing.Square;

public class SquareFactory implements FigureFactory {
    @Override
    public Figure create() {
        return new Square((int)(1 + Math.random()*15), FigureColors.randomColor());
    }
}
