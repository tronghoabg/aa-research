package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class wnj {
    final Map a = new HashMap();
    public final double b;
    public final double c;

    private wnj(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public static wnj b(double d, double d2) {
        double d3;
        double d4;
        double d5 = d;
        HashMap map = new HashMap();
        int i = 100;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                d3 = d;
                d4 = d2;
                wnh.a(d3, d4, i2);
                break;
            }
            int i3 = (i2 + i) / 2;
            double dC = wox.c(i3, d5, map);
            int i4 = i3 + 1;
            double dC2 = wox.c(i4, d5, map);
            if (wox.c(i3, d5, map) >= d2 - 0.01d) {
                if (Math.abs(i2 - 50) < Math.abs(i - 50)) {
                    d5 = d;
                    i = i3;
                } else {
                    if (i2 == i3) {
                        d4 = d2;
                        wnh.a(d5, d4, i2);
                        d3 = d;
                        break;
                    }
                    d5 = d;
                    i2 = i3;
                }
            } else if (dC < dC2) {
                d5 = d;
                i2 = i4;
            } else {
                d5 = d;
                i = i3;
            }
        }
        return new wnj(d3, d4);
    }

    public static wnj c(int i) {
        wnh wnhVar = new wnh(i);
        return new wnj(wnhVar.a, wnhVar.b);
    }

    public final int a(int i) {
        Map map = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Integer numValueOf2 = (Integer) map.get(numValueOf);
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(wnh.a(this.b, this.c, i).c);
            map.put(numValueOf, numValueOf2);
        }
        return numValueOf2.intValue();
    }
}
