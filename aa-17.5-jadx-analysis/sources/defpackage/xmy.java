package defpackage;

/* loaded from: classes3.dex */
public final class xmy extends abnv implements abox {
    public static final xmy a;
    public aboh b = abpf.b;

    static {
        xmy xmyVar = new xmy();
        a = xmyVar;
        abnv.P(xmy.class, xmyVar);
    }

    private xmy() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xmw.class});
        }
        if (i2 == 3) {
            return new xmy();
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
        return abnv.L(xmy.class);
    }
}
