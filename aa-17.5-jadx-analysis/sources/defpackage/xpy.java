package defpackage;

/* loaded from: classes3.dex */
public final class xpy extends abnv implements abox {
    public static final xpy a;
    public int b;
    public int d;
    public String c = "";
    public int e = 1;

    static {
        xpy xpyVar = new xpy();
        a = xpyVar;
        abnv.P(xpy.class, xpyVar);
    }

    private xpy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", xou.h});
        }
        if (i2 == 3) {
            return new xpy();
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
        return abnv.L(xpy.class);
    }
}
