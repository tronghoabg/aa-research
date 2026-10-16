package defpackage;

/* loaded from: classes3.dex */
public final class xka extends abnv implements abox {
    public static final xka a;
    public int b;
    private int c;

    static {
        xka xkaVar = new xka();
        a = xkaVar;
        abnv.P(xka.class, xkaVar);
    }

    private xka() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xka();
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
        return abnv.L(xka.class);
    }
}
