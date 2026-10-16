package defpackage;

/* loaded from: classes3.dex */
public final class xpm extends abnv implements abox {
    public static final xpm a;
    public int e;
    private int g;
    public String b = "";
    public String c = "";
    public String d = "";
    public abod f = abnw.a;

    static {
        xpm xpmVar = new xpm();
        a = xpmVar;
        abnv.P(xpm.class, xpmVar);
    }

    private xpm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0006\u0016", new Object[]{"g", "b", "c", "d", "e", xou.k, "f"});
        }
        if (i2 == 3) {
            return new xpm();
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
        return abnv.L(xpm.class);
    }
}
