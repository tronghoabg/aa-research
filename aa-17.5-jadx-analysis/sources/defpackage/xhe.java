package defpackage;

/* loaded from: classes.dex */
public final class xhe extends abnv implements abox {
    public static final xhe a;
    public long b;
    public long c;
    public long d;
    public long e;
    private int f;

    static {
        xhe xheVar = new xhe();
        a = xheVar;
        abnv.P(xhe.class, xheVar);
    }

    private xhe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new xhe();
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
        return abnv.L(xhe.class);
    }
}
