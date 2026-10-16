package defpackage;

/* loaded from: classes.dex */
public final class xkn extends abnv implements abox {
    public static final xkn a;

    static {
        xkn xknVar = new xkn();
        a = xknVar;
        abnv.P(xkn.class, xknVar);
    }

    private xkn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xkn();
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
        return abnv.L(xkn.class);
    }
}
