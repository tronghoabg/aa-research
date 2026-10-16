package defpackage;

/* loaded from: classes3.dex */
public final class xpx extends abnv implements abox {
    public static final xpx a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    static {
        xpx xpxVar = new xpx();
        a = xpxVar;
        abnv.P(xpx.class, xpxVar);
    }

    private xpx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", xou.i});
        }
        if (i2 == 3) {
            return new xpx();
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
        return abnv.L(xpx.class);
    }
}
