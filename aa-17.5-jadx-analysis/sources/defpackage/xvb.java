package defpackage;

/* loaded from: classes3.dex */
public final class xvb extends abnv implements abox {
    public static final xvb a;
    private int b;
    private xvc c;

    static {
        xvb xvbVar = new xvb();
        a = xvbVar;
        abnv.P(xvb.class, xvbVar);
    }

    private xvb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0000\u0007ဉ\u0006", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xvb();
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
        return abnv.L(xvb.class);
    }
}
