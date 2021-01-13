package com.testing.factory;

import java.util.Arrays;
import java.util.Random;

public class FigureColors {
    public enum Colors {
        RED, GREEN, BLUE, YELLOW, BLACK, PURPLE, GREY, PINK
    }

    public static String randomColor(){
        Random random = new Random();
        String[] arrEnum = getNames(Colors.class);
        return arrEnum[random.nextInt(arrEnum.length)];
    }

    public static String[] getNames(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }
}
