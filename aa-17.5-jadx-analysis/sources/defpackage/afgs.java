package defpackage;

/* loaded from: classes.dex */
public class afgs {
    public static final afgr a = new afgr();
    public static final afgs b;

    static {
        Integer num = afdl.a;
        b = (num == null || num.intValue() >= 34) ? new afgt() : new afgp();
    }

    public double a() {
        throw null;
    }

    public int b() {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public long d() {
        throw null;
    }

    public long f() {
        return hv();
    }

    public long hv() {
        long jD;
        long j;
        do {
            jD = d() >>> 1;
            j = jD % 3000;
        } while ((jD - j) + 2999 < 0);
        return j;
    }
}
