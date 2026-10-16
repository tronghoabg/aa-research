package defpackage;

/* loaded from: classes3.dex */
public final class xpk extends abnv implements abox {
    public static final xpk a;
    public int c;
    public int e;
    private int f;
    public String b = "";
    public String d = "";

    static {
        xpk xpkVar = new xpk();
        a = xpkVar;
        abnv.P(xpk.class, xpkVar);
    }

    private xpk() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0005᠌\u0003", new Object[]{"f", "b", "c", xou.e, "d", "e", tap.m});
        }
        if (i2 == 3) {
            return new xpk();
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
        return abnv.L(xpk.class);
    }
}
