package defpackage;

/* loaded from: classes3.dex */
public final class xpi extends abnv implements abox {
    public static final xpi a;
    public int b;
    public int c = 1;

    static {
        xpi xpiVar = new xpi();
        a = xpiVar;
        abnv.P(xpi.class, xpiVar);
    }

    private xpi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", xou.d});
        }
        if (i2 == 3) {
            return new xpi();
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
        return abnv.L(xpi.class);
    }
}
