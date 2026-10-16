package defpackage;

/* loaded from: classes2.dex */
public final class pav extends abnv implements abox {
    public static final pav a;
    public int b = 0;
    public Object c;
    public int d;
    public pau e;
    private int f;

    static {
        pav pavVar = new pav();
        a = pavVar;
        abnv.P(pav.class, pavVar);
    }

    private pav() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002\u083f\u0000\u0003<\u0000\u0004ဉ\u0001", new Object[]{"c", "b", "f", "d", orj.o, orj.p, pas.class, "e"});
        }
        if (i2 == 3) {
            return new pav();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(pav.class);
    }
}
