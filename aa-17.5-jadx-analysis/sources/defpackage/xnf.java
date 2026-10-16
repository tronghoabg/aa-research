package defpackage;

/* loaded from: classes3.dex */
public final class xnf extends abnv implements abox {
    public static final xnf a;
    public int b;
    public xmz c;

    static {
        xnf xnfVar = new xnf();
        a = xnfVar;
        abnv.P(xnf.class, xnfVar);
    }

    private xnf() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xnf();
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
        return abnv.L(xnf.class);
    }
}
