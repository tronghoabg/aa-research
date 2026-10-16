package defpackage;

/* loaded from: classes.dex */
public final class xhu extends abnv implements abox {
    public static final xhu a;

    static {
        xhu xhuVar = new xhu();
        a = xhuVar;
        abnv.P(xhu.class, xhuVar);
    }

    private xhu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xhu();
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
        return abnv.L(xhu.class);
    }
}
