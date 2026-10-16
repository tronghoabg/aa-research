package defpackage;

/* loaded from: classes3.dex */
public final class xpt extends abnv implements abox {
    public static final xpt a;
    public long b;
    private int c;

    static {
        xpt xptVar = new xpt();
        a = xptVar;
        abnv.P(xpt.class, xptVar);
    }

    private xpt() {
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new xpt();
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
        return abnv.L(xpt.class);
    }
}
