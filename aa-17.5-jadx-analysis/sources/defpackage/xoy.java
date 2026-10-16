package defpackage;

/* loaded from: classes3.dex */
public final class xoy extends abnv implements abox {
    public static final xoy a;
    public int b;
    public int c;

    static {
        xoy xoyVar = new xoy();
        a = xoyVar;
        abnv.P(xoy.class, xoyVar);
    }

    private xoy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", xou.b});
        }
        if (i2 == 3) {
            return new xoy();
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
        return abnv.L(xoy.class);
    }
}
