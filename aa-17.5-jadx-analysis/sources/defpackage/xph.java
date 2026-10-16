package defpackage;

/* loaded from: classes3.dex */
public final class xph extends abnv implements abox {
    public static final xph a;
    public int b;
    public int c = 1;
    public int d;

    static {
        xph xphVar = new xph();
        a = xphVar;
        abnv.P(xph.class, xphVar);
    }

    private xph() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"b", "c", xln.g, "d", xou.c});
        }
        if (i2 == 3) {
            return new xph();
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
        return abnv.L(xph.class);
    }
}
