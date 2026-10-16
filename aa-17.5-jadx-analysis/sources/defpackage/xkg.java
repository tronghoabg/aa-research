package defpackage;

/* loaded from: classes3.dex */
public final class xkg extends abnv implements abox {
    public static final xkg a;
    public int b;
    public int c = 1;
    public int d = 1;
    public boolean e;

    static {
        xkg xkgVar = new xkg();
        a = xkgVar;
        abnv.P(xkg.class, xkgVar);
    }

    private xkg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002", new Object[]{"b", "c", tap.t, "d", xku.t, "e"});
        }
        if (i2 == 3) {
            return new xkg();
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
        return abnv.L(xkg.class);
    }
}
