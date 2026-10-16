package defpackage;

/* loaded from: classes3.dex */
public final class xie extends abnv implements abox {
    public static final xie a;
    public xid b;
    private int c;

    static {
        xie xieVar = new xie();
        a = xieVar;
        abnv.P(xie.class, xieVar);
    }

    private xie() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xie();
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
        return abnv.L(xie.class);
    }
}
