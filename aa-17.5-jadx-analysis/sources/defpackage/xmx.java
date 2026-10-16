package defpackage;

/* loaded from: classes3.dex */
public final class xmx extends abnv implements abox {
    public static final xmx a;
    public xmw b;
    public boolean c;
    public boolean d;
    private int e;

    static {
        xmx xmxVar = new xmx();
        a = xmxVar;
        abnv.P(xmx.class, xmxVar);
    }

    private xmx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new xmx();
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
        return abnv.L(xmx.class);
    }
}
