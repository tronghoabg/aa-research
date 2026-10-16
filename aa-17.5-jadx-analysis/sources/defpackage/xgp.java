package defpackage;

/* loaded from: classes3.dex */
public final class xgp extends abnv implements abox {
    public static final xgp a;
    public abog b = abor.a;

    static {
        xgp xgpVar = new xgp();
        a = xgpVar;
        abnv.P(xgp.class, xgpVar);
    }

    private xgp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xgp();
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
        return abnv.L(xgp.class);
    }
}
