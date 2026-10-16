package defpackage;

/* loaded from: classes3.dex */
public final class xmw extends abnv implements abox {
    public static final xmw a;
    public int b;
    public xmz c;
    public xmr d;

    static {
        xmw xmwVar = new xmw();
        a = xmwVar;
        abnv.P(xmw.class, xmwVar);
    }

    private xmw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xmw();
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
        return abnv.L(xmw.class);
    }
}
