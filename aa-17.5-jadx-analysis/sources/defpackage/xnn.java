package defpackage;

/* loaded from: classes3.dex */
public final class xnn extends abnv implements abox {
    public static final xnn a;
    public aboh b = abpf.b;

    static {
        xnn xnnVar = new xnn();
        a = xnnVar;
        abnv.P(xnn.class, xnnVar);
    }

    private xnn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", xio.class});
        }
        if (i2 == 3) {
            return new xnn();
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
        return abnv.L(xnn.class);
    }
}
