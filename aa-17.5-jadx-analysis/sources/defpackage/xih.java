package defpackage;

/* loaded from: classes.dex */
public final class xih extends abnv implements abox {
    public static final xih a;

    static {
        xih xihVar = new xih();
        a = xihVar;
        abnv.P(xih.class, xihVar);
    }

    private xih() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xih();
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
        return abnv.L(xih.class);
    }
}
