package org.tajry;

public class OrderProcessor {

    public double calc(double p, double t, double d, boolean c) {
        double r = p * t;
        if (c) {
            r = r - (r * d);
        }
        return r;
    }
}
