package org.tajry;

public class OrderProcessor {

    public double calc(double p, double t, double d, boolean c) {
        double rs = p * t;
        if (c) {
            rs = rs - (rs * d);
        }
        return rs;
    }
}
