package com.testing.factory;

import com.testing.Figure;
import com.testing.Trapezoid;

public class TrapezoidFactory implements FigureFactory {
    @Override
    public Figure create() {
        int upperSide = (int)(4 + Math.random()*9);
        int side = (int)(1 + Math.random()*15);
        int maxDownSide = upperSide + side + side;
        int downSide = ((int)((upperSide + 1) + Math.random()*(maxDownSide - upperSide - 1)));
        return new Trapezoid(side, upperSide, downSide, FigureColors.randomColor());
    }
}