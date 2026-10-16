package defpackage;

/* loaded from: classes3.dex */
public final class xgo extends abnv implements abox {
    public static final xgo a;
    public abod b = abnw.a;

    static {
        xgo xgoVar = new xgo();
        a = xgoVar;
        abnv.P(xgo.class, xgoVar);
    }

    private xgo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001'", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xgo();
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
        return abnv.L(xgo.class);
    }
}
