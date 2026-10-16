package defpackage;

/* loaded from: classes3.dex */
public final class xoj extends abnv implements abox {
    public static final xoj a;
    public abod b = abnw.a;

    static {
        xoj xojVar = new xoj();
        a = xojVar;
        abnv.P(xoj.class, xojVar);
    }

    private xoj() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xoj();
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
        return abnv.L(xoj.class);
    }
}
