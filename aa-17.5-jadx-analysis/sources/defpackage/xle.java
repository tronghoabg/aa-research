package defpackage;

/* loaded from: classes3.dex */
public final class xle extends abnv implements abox {
    public static final xle a;
    public int b;
    public int c;
    public boolean d;

    static {
        xle xleVar = new xle();
        a = xleVar;
        abnv.P(xle.class, xleVar);
    }

    private xle() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001", new Object[]{"b", "c", xku.e, "d"});
        }
        if (i2 == 3) {
            return new xle();
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
        return abnv.L(xle.class);
    }
}
