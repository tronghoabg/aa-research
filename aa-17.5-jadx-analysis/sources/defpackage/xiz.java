package defpackage;

/* loaded from: classes3.dex */
public final class xiz extends abnv implements abox {
    public static final xiz a;
    public xnl b;
    private int c;

    static {
        xiz xizVar = new xiz();
        a = xizVar;
        abnv.P(xiz.class, xizVar);
    }

    private xiz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xiz();
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
        return abnv.L(xiz.class);
    }
}
