package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class abzz {
    final Map a = new HashMap();
    public final double b;
    public final double c;

    public abzz(double d, double d2) {
        this.b = d;
        this.c = d2;
    }

    public static abzz b(int i) {
        abzv abzvVar = new abzv(i);
        return new abzz(abzvVar.a, abzvVar.b);
    }

    public final int a(int i) {
        Integer numValueOf;
        Map map = this.a;
        Integer num = (Integer) map.get(Integer.valueOf(i));
        if (num == null) {
            int i2 = 99;
            if (i == 99) {
                double d = this.b;
                if (d < 105.0d || d >= 125.0d) {
                    i = 99;
                    numValueOf = Integer.valueOf(new abzv(abzw.b(this.b, this.c, i)).c);
                    i2 = i;
                    map.put(Integer.valueOf(i2), numValueOf);
                    num = numValueOf;
                } else {
                    int iA = a(98);
                    int iA2 = a(100);
                    numValueOf = Integer.valueOf((Math.round(((iA & 255) + (iA2 & 255)) / 2.0f) & 255) | ((Math.round((((iA >>> 16) & 255) + ((iA2 >>> 16) & 255)) / 2.0f) & 255) << 16) | (-16777216) | ((Math.round((((iA >>> 8) & 255) + ((iA2 >>> 8) & 255)) / 2.0f) & 255) << 8));
                    map.put(Integer.valueOf(i2), numValueOf);
                    num = numValueOf;
                }
            } else {
                numValueOf = Integer.valueOf(new abzv(abzw.b(this.b, this.c, i)).c);
                i2 = i;
                map.put(Integer.valueOf(i2), numValueOf);
                num = numValueOf;
            }
        }
        return num.intValue();
    }
}
