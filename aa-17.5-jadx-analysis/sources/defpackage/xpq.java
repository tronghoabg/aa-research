package defpackage;

@Deprecated
/* loaded from: classes3.dex */
public final class xpq extends abnv implements abox {
    public static final xpq a;
    public String b = "";
    public String c = "";
    public String d = "";
    public int e;
    public int f;
    private int g;

    static {
        xpq xpqVar = new xpq();
        a = xpqVar;
        abnv.P(xpq.class, xpqVar);
    }

    private xpq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0005᠌\u0004", new Object[]{"g", "b", "c", "d", "e", xou.k, "f", xou.f});
        }
        if (i2 == 3) {
            return new xpq();
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
        return abnv.L(xpq.class);
    }
}
