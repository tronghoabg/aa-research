package defpackage;

/* loaded from: classes3.dex */
public final class xjp extends abnv implements abox {
    public static final xjp a;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        xjp xjpVar = new xjp();
        a = xjpVar;
        abnv.P(xjp.class, xjpVar);
    }

    private xjp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xjp();
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
        return abnv.L(xjp.class);
    }
}
