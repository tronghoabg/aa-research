package defpackage;

/* loaded from: classes3.dex */
public final class xjr extends abnv implements abox {
    public static final xjr a;
    public int b;
    public int c;
    public int d;

    static {
        xjr xjrVar = new xjr();
        a = xjrVar;
        abnv.P(xjr.class, xjrVar);
    }

    private xjr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new xjr();
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
        return abnv.L(xjr.class);
    }
}
