package defpackage;

/* loaded from: classes3.dex */
public final class xnd extends abnv implements abox {
    public static final xnd a;
    public int b;
    public int c = 1;

    static {
        xnd xndVar = new xnd();
        a = xndVar;
        abnv.P(xnd.class, xndVar);
    }

    private xnd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", xku.q});
        }
        if (i2 == 3) {
            return new xnd();
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
        return abnv.L(xnd.class);
    }
}
