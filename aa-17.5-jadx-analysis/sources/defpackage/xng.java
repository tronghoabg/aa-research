package defpackage;

/* loaded from: classes3.dex */
public final class xng extends abnv implements abox {
    public static final xng a;
    public int b = 1;
    private int c;

    static {
        xng xngVar = new xng();
        a = xngVar;
        abnv.P(xng.class, xngVar);
    }

    private xng() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"c", "b", xku.r});
        }
        if (i2 == 3) {
            return new xng();
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
        return abnv.L(xng.class);
    }
}
