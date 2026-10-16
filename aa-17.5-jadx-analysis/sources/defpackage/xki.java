package defpackage;

/* loaded from: classes.dex */
public final class xki extends abnv implements abox {
    public static final xki a;

    static {
        xki xkiVar = new xki();
        a = xkiVar;
        abnv.P(xki.class, xkiVar);
    }

    private xki() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xki();
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
        return abnv.L(xki.class);
    }
}
