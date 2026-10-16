package defpackage;

import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public final class abzy {
    public final abzz a;
    public final abzz b;
    public final abzz c;
    public final abzz d;
    public final abzz e;

    public abzy(int i) {
        abzv abzvVar = new abzv(i);
        double d = abzvVar.a;
        double d2 = abzvVar.b;
        woy.dN(d, d2, new HashMap());
        this.a = new abzz(d, d2);
        double d3 = d2 / 3.0d;
        woy.dN(d, d3, new HashMap());
        this.b = new abzz(d, d3);
        double d4 = 60.0d + d;
        double d5 = d2 / 2.0d;
        woy.dN(d4, d5, new HashMap());
        this.c = new abzz(d4, d5);
        double dMin = Math.min(d2 / 12.0d, 4.0d);
        woy.dN(d, dMin, new HashMap());
        this.d = new abzz(d, dMin);
        double dMin2 = Math.min(d2 / 6.0d, 8.0d);
        woy.dN(d, dMin2, new HashMap());
        this.e = new abzz(d, dMin2);
        woy.dN(25.0d, 84.0d, new HashMap());
        new abzz(25.0d, 84.0d);
    }
}
