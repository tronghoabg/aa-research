package defpackage;

/* loaded from: classes.dex */
public final class xij extends abnv implements abox {
    public static final xij a;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public abms f = abms.d;
    public int g;

    static {
        xij xijVar = new xij();
        a = xijVar;
        abnv.P(xij.class, xijVar);
    }

    private xij() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0003\u0005ဋ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new xij();
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
        return abnv.L(xij.class);
    }
}
