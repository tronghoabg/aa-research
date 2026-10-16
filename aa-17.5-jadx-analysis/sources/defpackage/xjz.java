package defpackage;

/* loaded from: classes3.dex */
public final class xjz extends abnv implements abox {
    public static final xjz a;
    public aboh b = abpf.b;

    static {
        xjz xjzVar = new xjz();
        a = xjzVar;
        abnv.P(xjz.class, xjzVar);
    }

    private xjz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xlw.class});
        }
        if (i2 == 3) {
            return new xjz();
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
        return abnv.L(xjz.class);
    }
}
