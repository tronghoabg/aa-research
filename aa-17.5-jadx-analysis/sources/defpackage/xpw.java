package defpackage;

/* loaded from: classes3.dex */
public final class xpw extends abnv implements abox {
    public static final xpw a;
    public int b;
    public int c;
    public abms d = abms.d;
    public xpu e;
    public xpm f;
    private int g;

    static {
        xpw xpwVar = new xpw();
        a = xpwVar;
        abnv.P(xpw.class, xpwVar);
    }

    private xpw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ည\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"g", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new xpw();
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
        return abnv.L(xpw.class);
    }
}
