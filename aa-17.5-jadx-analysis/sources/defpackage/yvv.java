package defpackage;

/* loaded from: classes3.dex */
public final class yvv extends abnv implements abox {
    public static final yvv a;
    public int b = 0;
    public Object c;

    static {
        yvv yvvVar = new yvv();
        a = yvvVar;
        abnv.P(yvv.class, yvvVar);
    }

    private yvv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"c", "b", yvt.class, yvq.class, yvr.class, yvw.class, yvp.class, yvu.class, ywa.class, yvz.class});
        }
        if (i2 == 3) {
            return new yvv();
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
        return abnv.L(yvv.class);
    }
}
