package defpackage;

/* loaded from: classes3.dex */
public final class znp extends abnv implements abox {
    public static final znp a;
    public znm b;
    public double c;
    public int d;
    private int e;

    static {
        znp znpVar = new znp();
        a = znpVar;
        abnv.P(znp.class, znpVar);
    }

    private znp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\n\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\n᠌\f", new Object[]{"e", "b", "c", "d", zli.c});
        }
        if (i2 == 3) {
            return new znp();
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
        return abnv.L(znp.class);
    }
}
