package defpackage;

/* loaded from: classes3.dex */
public final class xlt extends abnv implements abox {
    public static final xlt a;
    public int b;
    public boolean c;

    static {
        xlt xltVar = new xlt();
        a = xltVar;
        abnv.P(xlt.class, xltVar);
    }

    private xlt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xlt();
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
        return abnv.L(xlt.class);
    }
}
