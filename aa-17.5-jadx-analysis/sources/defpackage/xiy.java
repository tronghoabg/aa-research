package defpackage;

/* loaded from: classes3.dex */
public final class xiy extends abnv implements abox {
    public static final xiy a;
    public int b;
    public int c;

    static {
        xiy xiyVar = new xiy();
        a = xiyVar;
        abnv.P(xiy.class, xiyVar);
    }

    private xiy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"b", "c", tap.r});
        }
        if (i2 == 3) {
            return new xiy();
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
        return abnv.L(xiy.class);
    }
}
