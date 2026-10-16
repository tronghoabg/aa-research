package defpackage;

/* loaded from: classes3.dex */
public final class xgi extends abnv implements abox {
    public static final xgi a;
    public int b;
    public int c;
    public xgj d;

    static {
        xgi xgiVar = new xgi();
        a = xgiVar;
        abnv.P(xgi.class, xgiVar);
    }

    private xgi() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xgi();
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
        return abnv.L(xgi.class);
    }
}
