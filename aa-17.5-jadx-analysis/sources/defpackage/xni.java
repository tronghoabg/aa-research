package defpackage;

/* loaded from: classes3.dex */
public final class xni extends abnv implements abox {
    public static final xni a;
    public abms b = abms.d;
    private int c;

    static {
        xni xniVar = new xni();
        a = xniVar;
        abnv.P(xni.class, xniVar);
    }

    private xni() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xni();
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
        return abnv.L(xni.class);
    }
}
