package defpackage;

/* loaded from: classes3.dex */
public final class xon extends abnv implements abox {
    public static final xon a;

    static {
        xon xonVar = new xon();
        a = xonVar;
        abnv.P(xon.class, xonVar);
    }

    private xon() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new xon();
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
        return abnv.L(xon.class);
    }
}
