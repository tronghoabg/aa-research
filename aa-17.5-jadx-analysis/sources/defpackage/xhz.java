package defpackage;

/* loaded from: classes3.dex */
public final class xhz extends abnv implements abox {
    public static final xhz a;
    public int b;
    public xga c;

    static {
        xhz xhzVar = new xhz();
        a = xhzVar;
        abnv.P(xhz.class, xhzVar);
    }

    private xhz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xhz();
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
        return abnv.L(xhz.class);
    }
}
