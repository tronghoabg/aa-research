package defpackage;

/* loaded from: classes3.dex */
public final class xgn extends abnv implements abox {
    public static final xgn a;
    public aboc b = abnn.a;

    static {
        xgn xgnVar = new xgn();
        a = xgnVar;
        abnv.P(xgn.class, xgnVar);
    }

    private xgn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xgn();
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
        return abnv.L(xgn.class);
    }
}
