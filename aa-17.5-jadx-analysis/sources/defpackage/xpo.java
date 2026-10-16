package defpackage;

/* loaded from: classes3.dex */
public final class xpo extends abnv implements abox {
    public static final xpo a;
    public int b;
    private int c;

    static {
        xpo xpoVar = new xpo();
        a = xpoVar;
        abnv.P(xpo.class, xpoVar);
    }

    private xpo() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", xou.g});
        }
        if (i2 == 3) {
            return new xpo();
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
        return abnv.L(xpo.class);
    }
}
