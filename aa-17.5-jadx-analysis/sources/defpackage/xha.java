package defpackage;

/* loaded from: classes3.dex */
public final class xha extends abnv implements abox {
    public static final xha a;
    public int b;
    private int c;

    static {
        xha xhaVar = new xha();
        a = xhaVar;
        abnv.P(xha.class, xhaVar);
    }

    private xha() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", tap.n});
        }
        if (i2 == 3) {
            return new xha();
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
        return abnv.L(xha.class);
    }
}
