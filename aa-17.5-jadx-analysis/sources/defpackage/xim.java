package defpackage;

/* loaded from: classes.dex */
public final class xim extends abnv implements abox {
    public static final xim a;

    static {
        xim ximVar = new xim();
        a = ximVar;
        abnv.P(xim.class, ximVar);
    }

    private xim() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xim();
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
        return abnv.L(xim.class);
    }
}
