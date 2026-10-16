package defpackage;

/* loaded from: classes3.dex */
public final class xgt extends abnv implements abox {
    public static final xgt a;
    public int b;

    static {
        xgt xgtVar = new xgt();
        a = xgtVar;
        abnv.P(xgt.class, xgtVar);
    }

    private xgt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new xgt();
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
        return abnv.L(xgt.class);
    }
}
